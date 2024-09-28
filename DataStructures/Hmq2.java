package DataStructures;
import java.util.*;
public class Hmq2 {
    public static void main(String[] args) {
        int arr1 [] = {7,3,9};
        int arr2 [] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        for(int val : arr1){
            set.add(val);
        }

        for(int val : arr2){
            set.add(val);
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}
