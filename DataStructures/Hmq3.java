package DataStructures;
import java.util.HashSet;
public class Hmq3 {
    public static void main(String[] args) {
        int arr1 [] = {7,3,9};
        int arr2 [] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();
        for(int val : arr1){
            set.add(val);
        }

        int count=0;
        for(int val : arr2){
            if(set.contains(val)){
                System.out.println(val);
                count++;
                set.remove(val);
            }
        }

        System.out.println("Size of intersection is"+count);
    }
}
