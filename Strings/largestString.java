package Java.strings;

public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana", "papaya"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length;i++){
            // when <0 i.e., negative value means str2 is greater than str1
            // when >0 i.e., positive value means str1 is greater than str2
            // when =0 means str2 is equal to str1
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
