import java.util.*;
public class Switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("Enter a number between 1 to 7: ");
        day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1:
            case 3:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
        
            default:
                System.out.println("WRONG INPUT");
                break;
        }
    }
}
