package Java.userInput;
import java.util.Scanner;
public class positive_negative {
    public static void main(String args[]){
        System.out.println("Enter number to check");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=0){
            System.out.println("Number is positive");
        }
        else
            System.out.println("Number is negative");

    }
}
