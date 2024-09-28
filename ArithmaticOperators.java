import java.util.*;

public class ArithmaticOperators {
   public static void main(String[] args) {
    System.out.print("Enter two bumbers: ");
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    System.out.println("Addition:"+(n1+n2));
    System.out.println("Subtraction:"+(n1-n2));
    System.out.println("Multi[lication]:"+(n1*n2));
    System.out.println("Division:"+(n1/n2));
    System.out.println("Modulo:"+(n1%n2));

    sc.close();
   }    
}
