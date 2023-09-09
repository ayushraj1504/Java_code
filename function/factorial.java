package Java.function;
import java.util.*;
public class factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n;i++){
            f= f*i;
        }
        return f;

    }
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = factorial(a);
        System.out.println("Factorial of "+ a + " is"+" "+ fact);

    }
}
