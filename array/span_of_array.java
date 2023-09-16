// span is define as difference of maximum value and minimum value
/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value
Constraints
    1 <= n <= 10^4
    0 <= n1, n2
     .. n elements <= 10 ^9
*/
package Java.array;
import java.util.Scanner;
public class span_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println("Difference of max and min element is: " + span);
    }
}
