package DataStructures;

import java.util.ArrayList;
import java.util.*;

public class Stack {

    public ArrayList<Integer> stack;

    public Stack(){
        stack=new ArrayList<>();
    }

    public void push(int ele)
    {
        stack.add(ele);
    }

    public void pop()
    {
        stack.remove(stack.get(stack.size()-1)); 
        //remove function removes takes parameters as index of element or char that is to removed
        //stack.remove(stack.get(stack.size()-1)); removes the first occurance of that particular element [1 2 3 2] it will remove 2 that is in front of 3 and not after 3 which is not function of pop
        //stack.remove(stack.size()-1); it will pop the element that is entered last i.e this snippet will follow LIFO
    }

    public void peek()
    {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println(stack.get(stack.size()-1));
        }
    }

    public void display(){
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        while (true) {
            System.out.print("1 to push \n2 to pop\n3 to peek");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    int x =sc.nextInt();
                    s1.push(x);
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.peek();
                    break;
                case 4:
                    s1.display();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }

    }
    
}

//Last in first out
//Push operation, Pop Operation, Peek, isEmpty
//Time complexity Big O(1)

//Stack using array, arraylist, linkedlist{Make new element as head}
