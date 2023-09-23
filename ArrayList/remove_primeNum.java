/*1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.*/

package Java.ArrayList;
import java.util.*;
public class remove_primeNum {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void solution(ArrayList<Integer> num){
        for(int i = num.size()-1; i>=0; i--){
            int val = num.get(i);
            if(isPrime(val) == true ){
                num.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter ArrayList element ");
        for(int i= 0; i<n;i++){
            l1.add(sc.nextInt());
        }
        solution(l1);
        System.out.println(l1);
    }
}
