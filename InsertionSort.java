public class InsertionSort implements SortingAlgorithm{

	public void sort(int []arr ){
		int n = arr.length;
		
			for(int i =1; i<n;i++){
				int temp = arr[i];
				int x =i-1;
				while(x> -1 && arr[x]>temp){
					arr[x+1] =arr[x];
					x--;
				}
				arr[x+1]=temp;
			}
	}
	

}