package Java.loop;

public class break_loop {
    public static void main(String args[]){

        for (int i=1;i<=5;i++){

            System.out.println(i);
            if (i==3){
                break;
            }
        }
        System.out.println("Program exit due to break statement");
    }
}
