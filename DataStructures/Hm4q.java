package DataStructures;
import java.util.*;
public class Hm4q {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai","Benguluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        HashSet<String> from = new HashSet<>();
        HashSet<String> to = new HashSet<>();

        for(Map.Entry<String,String>e:map.entrySet()){
            from.add(e.getKey());
            to.add(e.getValue());
        }
        String source = "";
        Iterator<String> it = from.iterator();
        while(it.hasNext()){
            source = it.next();
            if(!to.contains(source)){
                System.out.println("Source: "+ source);
                break;
            }
        }

        String new_source=source;
        System.out.print(new_source);
        for(Map.Entry<String,String>e:map.entrySet()){
            System.out.print("->");
            System.out.print(map.get(new_source));
            new_source=map.get(new_source);
        }
    }
}
