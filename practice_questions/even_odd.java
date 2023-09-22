package Java.practice_questions;
import java.util.Scanner;
public class even_odd {
    public static void check_evenOdd(int num){
        if(num%2==0){
            System.out.println("Number is even ");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();
        check_evenOdd(num);
    }

}
