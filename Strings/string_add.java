package Java.strings;

public class string_add {
    public static void main(String[] args) {
        String str = new String("");
        for (char ch='a';ch<='z';ch++){
            str+=ch;
        } // its time complexity is O(n*n)
        System.out.println(str);
        System.out.println(str.length());
    }
}
