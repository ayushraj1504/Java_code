package Java.array;
import java.util.*;
public class linearSearch {
    public static int linSea(int num[], int key){
        int i;
        for(i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int result= linSea(num,key);
        if (result ==-1){
            System.out.println("Data not found");
        }
        else{
            System.out.println("Element found at index"+ " "+ result);
        }

    }
}
