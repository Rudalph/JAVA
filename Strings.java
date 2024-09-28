import java.util.*;

public class Strings {
    public static void main(String[] args) {
        char [] myFirstString = {'R','u','d','a','l','p','h'};
        String str = new String(myFirstString);
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your second string");
        String mySecondString = sc.nextLine();
        System.out.println(mySecondString);
        sc.close();    
    }
}
