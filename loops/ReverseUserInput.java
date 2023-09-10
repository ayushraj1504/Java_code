package Java.loop;

import java.util.Scanner;

public class ReverseUserInput {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number to reverse");
    int n = sc.nextInt();
    int a,reverse=0;
        while(n>0){
        a = n%10;
        reverse = reverse*10+a;
        n = n/10;


    }
        System.out.print( "reverse number is " + reverse);


}
}
