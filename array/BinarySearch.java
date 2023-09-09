package Java.array;

public class BinarySearch {
    public static int BS(int arr[],int key){
        int start = 0, end = arr.length -1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){ // if mid-value is greater than key then we search in 1st half of the array i.e., left side of mid-value
                end = mid-1;   // so we have to update our end for searching in left side
            }
            else{        // if mid-value is smaller than key then we search in 2nd half of the array i.e., right side of mid-value
                start = mid+1;  //// so we have to update our start for searching in right side
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 4;
        System.out.println("Key found at index "+ BS(arr,key));
    }
}

