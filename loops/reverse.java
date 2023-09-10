package Java.loop;

public class reverse {
    public static void main(String args[]){
        int n=1504,a;
        for(int i=0 ; i<=3;i++){
            a = n%10;
            n = n/10;
            System.out.print(a +"\t");
            //System.out.print(" ");
        }

    }
}
