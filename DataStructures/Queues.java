package DataStructures;

public class Queues {
     
    static class Queue {
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }

        public static boolean isEmpty() {
            return rear==-1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.print("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//First in First out
//Front->{Remove element} & Rear->{Add element}
//operation: 1] Enque(add elements)
//           2] Dequeue(Remove elements)
//           3] Front(peek element visulization)
//Double ended queue Front rear at both side also called Deque

//Impementation: 1.Array 2.Circular Queue 3.Linkedlist

//F=-1 R=-1 one element added f++ and r++ for second element only r incrments and f remains at same pos

//Using array add{BigO(1)}  Peek+remove{BigO(n)}
//Time complexity using circular queue for al operations is {BigO(n)}>>>So when ever its implementation using array try to user circular queue so less time complexity is acheived
//Rear=(Rear+1)%size