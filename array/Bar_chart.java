/*1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a
Constraints
 1 <= n <= 30
 0 <= n1, n2, .. n elements <= 10
*/
package Java.array;
import java.util.Scanner;
public class Bar_chart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter element of array ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor=max; floor >= 1; floor--){
            for(int building=0;building<arr.length;building++){
                if(arr[building] >= floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
