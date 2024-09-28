import java.util.*;

class Arrays 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements one by one");
        int [] array = new int [5];
        for(int i=0; i<5; i++)
        {
            array[i]=sc.nextInt();
        }

        for(int i=0; i<5; i++)
        {
            System.out.println(array[i]);
        }
       

        char [] arr = new char [7];
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(char item: arr)
        {
            System.out.println(item);
        }
 sc.close();   
    }
}