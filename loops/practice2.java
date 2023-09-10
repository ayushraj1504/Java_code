// Write a program that reads a set of integers, and then prints the sum of the even and odd integers
package Java.loop;
import java.util.Scanner;
public class practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,choice;
        int evenSum=0,oddSum=0;
        do{
            System.out.println("Enter any number ");
            num = sc.nextInt();
            if (num%2==0){
                evenSum +=num;
            }
            else{
                oddSum +=num;
            }
            System.out.println("Want to continue press 1 else 0");
            choice = sc.nextInt();
        }while (choice == 1);
        System.out.println("Sum of even number " + evenSum);
        System.out.println("Sum of odd number " + oddSum);



    }
}
