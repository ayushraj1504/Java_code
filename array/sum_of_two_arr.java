/* Sum of two array
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.
Constraints:
 1<=n1, n2<=100
 0<=a1[i], a2[i]<10   */
package Java.array;
import java.util.Scanner;
public class sum_of_two_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter element of first array ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter element of second array ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2? n1: n2];
        int c = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        while (k>=0){
            int d=c;

            if(i >= 0){
                d+=arr1[i];
            }

            if(j >= 0){
                d+=arr2[j];
            }

            c = d/10;
            d = d%10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.print(c+ "\t");
            // or System.out.println(c);
        }
        for (int val:sum){
            System.out.print(val + "\t");
            // or System.out.println(val);
        }

    }

}
