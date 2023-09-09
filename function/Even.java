package Java.function;
import java.util.*;
public class Even {
    public static void isEven(int a){
        if (a%2==0){
            System.out.println("Number is even");
            //return true;
        }else
            System.out.println("Number is odd");
            //return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int a = sc.nextInt();
        isEven(a);
        //System.out.println(result);
    }
}
