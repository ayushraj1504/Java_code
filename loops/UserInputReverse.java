package Java.loop;
import java.util.Scanner;
public class UserInputReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to reverse");
        int n = sc.nextInt();
        int a;
        while(n!=0){
            a = n%10;
            n = n/10;
            System.out.print( a + "\t");

        }

    }
}
