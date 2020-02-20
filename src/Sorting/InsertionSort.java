package Sorting;

public class InsertionSort {
	public static void main(String args[]){
		int arr[]={9,6,5,0,8,2,7};
		int key;
		for(int j=1;j<arr.length;j++){
			 key=arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key){
				arr[i+1]=arr[i];
				i=i-1;
			
			}
			arr[i+1]=key;
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		
	}

}
