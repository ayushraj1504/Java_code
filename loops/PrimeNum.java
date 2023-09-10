//Check whether the number is prime or not
package Java.loop;
import java.util.*;
public class PrimeNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        boolean isPrime;
        isPrime = true;
        if (n==2){     // this is default condition bcz 2 is the smallest prime number
            System.out.println("Number is prime");
        }
        else{
            //for(int i=2;i<=Math.sqrt(n);i++);   this loop is run from 2 to root under n (Math.sqrt(n)) times i.e., half of the lower method, and it takes half times as compared to lower method and save time when number is very large
            for(int i=2; i<=n-1; i++){  // this loop is run from 2 to (n-1) times i.e., (n-2)times which takes more time when user input number is large
                if(n%i==0){  // n is multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Number is not prime");
            } else {
                System.out.println("Number is Prime");
            }
        }

    }
}
