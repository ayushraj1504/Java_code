/*1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k. */

package Java.array;
import java.util.Scanner;
public class Rotate_an_array {
    public static void rotate (int[] a, int n, int k){
            // If rotation is greater than size of array
            k=k%n;

            for(int i = 0; i < n; i++)
            {
                if(i<k)
                {
                    // Printing rightmost kth elements
                    System.out.print(a[n + i - k] + " ");
                }
                else
                {
                    // Prints array after 'k' elements
                    System.out.print(a[i - k] + " ");
                }
            }
            System.out.println();

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element of array ");
        for (int i=0; i< n; i++){
            a[i] = sc.nextInt();

    }
        System.out.print("Enter the value of k: ");

        int K = sc.nextInt();
        rotate(a, n, K);

    }
}


