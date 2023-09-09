package Java.bitWiseOperator;
// even and odd of binary number
public class evenOdd {
    public static void EvenOrOdd(int n){
        int bitmass = 1;
        if ((n & 1)==0){
            // even
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        int n = 111;
        int n1 = 100;
        EvenOrOdd(n);
        EvenOrOdd(n1);
    }
}
