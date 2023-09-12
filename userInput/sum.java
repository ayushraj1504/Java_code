package Java.userInput;
import java.util.*;   // import this to use scanner class

public class sum {
    public static void main(String args[]){
        System.out.println("Enter two number for sum or add");
        Scanner sc = new Scanner(System.in);    // used to take input
        int a = sc.nextInt();                   // used to take integer type input
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);



    }
}
