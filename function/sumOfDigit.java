package Java.function;
import java.util.*;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);

        System.out.println("Sum of digit is" + " "+ res);
    }
    public static int sum(int n){
        int res=0;
        while (n>0){
            int lastdigit = n%10;
            res = res+lastdigit;
            n = n/10;

        }
        return res;
    }
}
