package DataStructures;

public class LinearSearch {
   public static void main(String[] args) {
     int [] arr = {1,2,3,4,5};
     int key = 3; 
     int ans = -1;
     for(int i=0; i<arr.length; i++){
        if(arr[i]==key){
            ans=i;
            break;
        }
     }
     System.out.println(ans);
   } 
}
