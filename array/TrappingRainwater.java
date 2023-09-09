package Java.array;
import java.util.*;
public class TrappingRainwater {
    public static int trappedWater(int height[]){
        int n = height.length;         // we store the length of array in variable n
        // calculate leftMax boundary
        int leftMax[] = new int[n]; //create auxiliary array leftMax[] to store leftMax boundary
        leftMax[0] = height[0];     //initialise height of leftMax with height of bar at 0th index
        for (int i=1; i<n;i++){     //start loop from 1st index bcz 0th index value is already stored in leftMax
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }

        // calculate rightMax boundary
        int rightMax[] = new int[n]; //create auxiliary array rightMax[] to store rightMax boundary
        rightMax[n-1] = height[n-1]; //initialise height of rightMax with height of bar at last index
        for (int i=n-2; i>=0; i--){  //start loop from secondLast index bcz last index value is already stored in rightMax
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0; //initialise trappedWater with zero
        for (int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i] , rightMax[i]); //to find the water level, we have to find the minimum of leftMax and rightMax
            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
