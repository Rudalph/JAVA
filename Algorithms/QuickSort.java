package Algorithms;

public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
       if(low<high){
        int pidx = partition(arr, low, high);
        quickSort(arr, low, pidx-1);
        quickSort(arr, pidx+1, high);
       }
    }
    public static void main(String[] args) {
        int [] array = {6,3,9,5,2,8};
        int n = array.length;
        quickSort(array, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}

//2 main points 1. Pivote  2. Partition
//last element as pivote and ele<p to left of p and ele>p to right
//low = starting index and high=ending index i=low-1;
