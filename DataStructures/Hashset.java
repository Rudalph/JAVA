package DataStructures;
import java.util.HashSet;   
import java.util.Iterator;                 
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //search
        if(set.contains(1)){
            System.out.println("Exist");
        }else{
            System.out.println("No");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("removed");
        }

        //Size of set
        System.out.println(set.size());

        System.out.println(set);

        //Iterator  it has 2 main functions hasNext() and next()
        //it.next() will return the next of current value it initially it represent null
        //has.next() returns true if there exist a next value else will return false
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

//for hashset time comlexity for insertion search and remove is BigO(1)
