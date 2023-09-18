/*1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a
Constraints
    0 <= n < 10^4
    -10^9 <= a[i] <= 10^9
*/
package Java.array;
import java.util.Scanner;
public class reverse_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            last--;
            first++;
        }
        System.out.println("Reverse array is: ");
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
