//Write a program to print the multiplication table of a number N, entered by the user
package Java.loop;
import java.util.Scanner;
public class practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
            int a = n*i;
            System.out.println(n + "*" + i + "=" + a);
            //System.out.printf("%d * %d = %d\n",n,i,a);   this is also a method which generally used in C programing language
        }
    }


}
