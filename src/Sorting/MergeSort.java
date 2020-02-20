package Sorting;

public class MergeSort {

	 public void merge(int A[],int p,int q,int r)
	{
		int n1=q-p+1;//no of elements in n1 and n2;
		int n2=r-q;//no of elements in n1 and n2;
		
		int L[]=new int[1+n1];
	//size of the Left array is n1+(1) for the infinte element.
		int R[]=new int[1+n2];
	//size of the Right array is n2+(1) for the infinte element.
		
	//COPY DATA TO TEMP ARRAYS	
		for(int i=0;i<n1;i++)
		{
			L[i]=A[p+i-1];
		}
		
		for(int j=0;j<n2;j++)
		{
			R[j]=A[q+j];
		}
		
		L[n1+1]=999999999;//last element mean to be infintive.
		R[n2+1]=999999999;//last element mean to be infintive.
		
	int i=0,j=0;//INDEXES OF THE FIRST AND SECOND SUBARRAY.
	for(int k=p;k<r;k++){
		if(L[i]<=R[j]){
			A[k]=L[i];
			i++;
		}
		else{
			A[k]=R[j];
			j++;
		}
	}
		
		
			
		
		
		
	}
	
	 public void mergeSort(int A[],int p,int r){
		
		if(p<r){
			int q=(p+r)/2;//find the middle point in number it has to
			//be divided.
//Sort first and second halves.
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
//Sort first and second halves	
			merge(A, p, q, r);
		}
		
		
		
	}
	static void printarray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			
		}
	}
	
	public static void main(String[] args) {
		int arr[]={1,5,7,8,2,4,6,9};
		System.out.println("GIVEN ARRAY");
		printarray(arr);
		
		//DRIVER CODE...
		
		MergeSort ms=new MergeSort();
		ms.mergeSort(arr, 0,arr.length-1);
		
		System.out.println("SORTED ARRAY");
		printarray(arr);

	}

}
