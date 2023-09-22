package Java.practice_questions;

import java.util.Scanner;

public class conditional_ques1 {
    public static boolean condition_check(int num) {
        if (num > 5) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();
        System.out.println("Is number is greater than 5:" + " " + condition_check(num));
    }
}
