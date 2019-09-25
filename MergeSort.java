import java.util.Arrays;
public class MergeSort implements SortingAlgorithm{
	private void merge(int []arr,int []left,int []right){
		int i = 0;
		int j = 0;
		int k = 0;

		//System.out.println("Merging " + Arrays.toString(left) + " with " + Arrays.toString(right));

		while( i<left.length &&j <right.length){
			if(left[i]<= right[j]){
				arr[k++]=left[i++];
			}
			else{
				arr[k++]=right[j++];
			}
		}
		while(i<left.length){
			arr[k++]=left[i++];

		}
		while(j<right.length){
			arr[k++]= right[j++];
		}

		//System.out.println("\t" + Arrays.toString(arr));

	}
	public void sort(int [] arr){
		if(arr.length>1){
			// System.out.println("Spllitting array " + Arrays.toString(arr));
			int[]left= Arrays.copyOfRange(arr, 0 ,arr.length/2);
			int[]right = Arrays.copyOfRange(arr ,arr.length/2 ,arr.length);
			// System.out.println("\t" + Arrays.toString(left) + " and " + Arrays.toString(right));
			sort(left);
			sort(right);
			merge(arr , left,right);

		}

	}


}