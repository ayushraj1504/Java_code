package Java.array;

import java.sql.SQLOutput;

public class ReverseOfArray {
    public static void reverse(int arr[]){
        int first =0,last = arr.length -1;
        while (first < last){
            //swapping
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,7,9,2,3,0,2};
        System.out.println("Original array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Reversed array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
