package Java.array;
import java.util.Scanner;
public class print_subArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sub-arrays are: ");
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
