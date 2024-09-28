package DataStructures;

public class LinkedList {
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    Node head =null;

    //add- first 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
           head=newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    
    }

    public void printList(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data);
            currNode=currNode.next;
        }
    }

    public void delete(int n){  //We have to write special case for 1st and last node
        Node currNode1 = head;
        for(int i=0; i<n-1; i++){
           currNode1=currNode1.next;
        }

        Node currNode2 = head;
        for(int i=0; i<n; i++){
           currNode2=currNode2.next;
        }

        currNode1.next=currNode2.next;
    }

    public void size(){
        int size=0;
        Node currNode = head;
        while(currNode!=null){
          size++;
          currNode=currNode.next;
        }
        System.out.println(size);
    }

    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.addFirst("Rudalph");
        List.addFirst("Gonsalves");
        List.addLast("is");
        List.addLast("Good");
        List.addLast("Boy");
        List.printList();
        List.delete(1);
        List.printList();
        List.size();
    }
}




