package Java.function;
import java.util.*;
public class avgOfThree {
    public static float avg(int phy,int che,int maths){

        float average = (phy+che+maths)/3f;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int che = sc.nextInt();
        int maths = sc.nextInt();
        float result = avg(phy,che,maths);
        System.out.println("Average of three number is: "+ result);

    }

}
