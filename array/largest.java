package Java.array;
import java.util.*;

public class largest {
    public static void main(String[] args) {
       int arr[]= {2,6,4,9,3};
       int ans= largestNum(arr);
        System.out.println("Largest element is"+ " "+ ans);
    }
    public static int largestNum(int arr[]){
        int i,l =arr[0];
        for (i=1;i<arr.length;i++){
            if (arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }

}
