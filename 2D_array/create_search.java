package Java.array_2d;
import java.util.Scanner;
public class create_search {
    public static boolean search(int arr[][], int key){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==key){
                    System.out.println("element found at " + i +","+ j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]= new int[3][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,89);
    }
}
