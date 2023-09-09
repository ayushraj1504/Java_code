
package Java.function;
import java.util.*;

public class product {
    public static int multiply(int a, int b){
        int result = a*b;
        return result;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a,b);
        System.out.print("a*b="+result);
    }

}
