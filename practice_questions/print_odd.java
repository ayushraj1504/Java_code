package Java.practice_questions;

public class print_odd {
    public static void main(String[] args) {
        System.out.println("Odd number between 1 to 10: ");
        for(int i=1; i<=10; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
