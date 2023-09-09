package Java.array_2d;

public class diagonal_sum2 {
    public static int digsum(int matrix[][]){  // Time complexity = O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            // primary diagonal where i==j
            sum+=matrix[i][i];
            // secondary diagonal where i+j=n-1. then, j=n-1-i, here n is matrix.length
            if(i!=matrix.length-1-i){  // this condition is for not to add middle element twice
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(digsum(matrix));
    }
}
