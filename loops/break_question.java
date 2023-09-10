package Java.loop;
import java.util.Scanner;
public class break_question {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter number");
            int n = sc.nextInt();

            if (n%10==0){
                break;
            }
            System.out.println("your input " + n);
        }while(true);
        System.out.println("Program exit bcz user enter multiple of 10");

    }
}
