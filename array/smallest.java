package Java.array;
import java.util.*;
public class smallest {
    public static int small(int arr[]){
        int s = arr[0];
        for (int i=1;i<arr.length;i++){
            if(s>arr[i]){
                s = arr[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,6,1,7};
        System.out.println("Smallest number is: "+ small(arr));
    }
}
