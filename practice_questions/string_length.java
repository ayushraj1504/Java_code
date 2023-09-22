package Java.practice_questions;
import java.util.Scanner;
public class string_length {
    public static int check_length(String str){
        return str.length();
    }
    public static void check_len_without_fun(String str){
        int i = 0;
        for(char c: str.toCharArray()) {
            i++;
        }
        System.out.println("Length of given string without predefined function: "+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to count length: ");
        String str = sc.nextLine();
        System.out.println("Total length of string is: "+ check_length(str));
        check_len_without_fun(str);
    }

}
