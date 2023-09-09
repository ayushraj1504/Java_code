package Java.strings;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch='a';ch<='z';ch++){
            sb.append(ch);
        } // its time complexity is O(26)
        System.out.println(sb);
        System.out.println(sb.length());
        //we can perform all function of String in StringBuilder also but String takes more time than StringBuilder
        //Because String is immutable so its always copy and rewrite the str but StringBuilder is mutable so its append the older str without copying it

    }
}
