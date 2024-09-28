package DataStructures;
import java.util.*;
public class Hmq1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int nums [] = {1,3,2,5,1,3,1,5,1};

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int x = map.get(nums[i]);
                x++;
                map.put(nums[i],x);
            }else{
                map.put(nums[i], 1);
            }
        }
        System.out.print(map);

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>9/3){
                System.out.println(e.getKey());
            }
        }
    }
}
