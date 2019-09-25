public class QuickSort implements SortingAlgorithm{
    private int []array;


    public void sort(int[]arr){
        if( arr == null || arr.length == 0 ){
            return;
        }
        this.array = arr;
        
        quick(0, arr.length-1);

    }
    private void swapping(int i , int j ){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private void quick(int low, int high){
        int i = low;
        int j = high;
        int pivot = array[low+(high-low)/2];
        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if(i<=j){
                swapping(i,j);
                i++;
                j--;

            }
        }
        if(low<j){
            quick(low,j);
        }
        if(i<high){
            quick(i,high);
        }
    }

    
}