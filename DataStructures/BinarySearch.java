package DataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60,70,80,90,100,110};
        int key=90;
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid]==key){
                System.out.print(mid);
                break;
            }
            else if(array[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}

//Sorted Array should be present
//step 1 find middle index = (high + low)/2
//step 2 check if key == middle ele
//step 3 if(middle ele>key) ans is in LHS repeate low = mid+1
//step 4 if(middle ele<key) ans is in RHS repeate high = mid-1