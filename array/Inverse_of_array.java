// index = 1 and value = 4
// In Inverse, index = 4 and value = 1
// Constraints
//   value must be smaller than the size of array
package Java.array;
import java.util.Scanner;
public class Inverse_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] inv_arr = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int v = arr[i];
            inv_arr[v] = i;
        }
        System.out.println("Element after Inverse: ");
        for (int i=0;i<inv_arr.length;i++){
            System.out.println(inv_arr[i]);
        }
    }

}
