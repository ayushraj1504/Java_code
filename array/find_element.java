// Find element in array
/*1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1
Constraints
    1 <= n <= 10^7
    -10^9 <= n1, n2
    .. n elements <= 10^9
    -10^9 <= d <= 10^9
*/
package Java.array;
import java.util.Scanner;
public class find_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array element: ");
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Number for searching: ");
        int key = sc.nextInt();
        int index = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;

            }
        }
        System.out.println("Element found at index: " + index);

    }
}
