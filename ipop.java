import java.util.*;

public class ipop {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        x=sc.nextInt();
        System.out.println("Number that you have entered is: "+x);

        System.out.printf("Formatted String is as follows: x=%d , y=%f", x, 22f/7);
        sc.close();
    }
}

//System is class from java.lang package
//out is static variable that represent output
//print is the method of class system
//Scanner class comes under java.util
//we create object of it usually as 'sc'
//System.in is used to read the input