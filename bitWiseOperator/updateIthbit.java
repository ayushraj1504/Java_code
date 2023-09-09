package Java.bitWiseOperator;

public class updateIthbit {
    public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int UpdtIthbit(int n, int i, int newbit){
        n = clearIthbit(n,i);
        int bitMask = newbit<<i;
        return n |bitMask;

    }

    public static void main(String[] args) {
        System.out.println(UpdtIthbit(10,2,1));
    }
}
