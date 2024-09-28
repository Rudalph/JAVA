package DataStructures;
import java.util.LinkedList;

class LinkedListCollectionFramework {
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<String>();

       list.addFirst("Rudalph");
       list.addLast("Gonsalves");
       list.addLast("Good");
       System.out.println(list);
       list.remove(2);
       System.out.println(list);

       for(int i=0; i<list.size(); i++){
         System.out.println(list.get(i));
       }
    }
}