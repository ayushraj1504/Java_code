// Write a program to find the factorial of any number entered by the user
package Java.loop;
import java.util.Scanner;
public class practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int f=1;
        for (int i=n;i>0;i--){
            f = f*i;
        }
        System.out.println("factorial of "+n+" "+ "is "+ f);

    }
}
