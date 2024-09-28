import java.util.*;
public class Recursion {
    static int sum = 1;
    static int x;
    public static int fun(int n){
        if(n==0){
            return 0;
        }
        sum=sum*n;
        int x =fun(n-1);
        System.out.println("Value of x is: "+x);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ans=fun(n);
        System.out.println(ans);
    }
}

// A function that calls itself  
//Memory usage is more
//Stack structure makes sense
//Given--->kaam--->basecase

//Last 2 qs of apna clg X^n wale qs ek baar dekna hai
//aur  3rd qs bhi revisit karna hai