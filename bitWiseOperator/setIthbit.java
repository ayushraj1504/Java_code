package Java.bitWiseOperator;

public class setIthbit {
    public static int Ithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(Ithbit(10,2));
    }
}
