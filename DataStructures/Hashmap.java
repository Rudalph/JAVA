package DataStructures;
import java.util.*;

public class Hashmap{
    public static void main(String[] args) {
        //CREATION
        HashMap<String,Integer> map = new HashMap<>();

        //INSERTION
        map.put("India",120);
        map.put("US",30);
        map.put("China",200);

        //DISPLAY
        System.out.println(map);
         
        //UPDATION
        map.put("China",2000);

        System.out.println(map);

        //SERACH----------- if exist true else false
        if(map.containsKey("China")){
            System.out.println("Key is present");
            System.out.println(map.get("China"));//if exist prints value
        }else{
            System.out.println("Not present");
            System.out.println(map.get("Chi"));//if dosent exists prints null
        }

        //ITERATE OVER HASHMAP
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //MAKING SET OF KEYS
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+""+map.get(key));
        }

        //REMOVE 
        map.remove("China");
        System.out.println(map);

    }
}

//key values pairs
//keys are unique Values may be same
//HashMap<Key_type, Value_type> HM_name = new HashMap<>();
//Unordered i.e it will print in any order

//map.put=> has 2 cases if ley present valu updated else new pair is inserted