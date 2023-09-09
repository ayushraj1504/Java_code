package Java.strings;

public class subString {
    public static String substring(String str, int start_index, int end_index){
        String substr = "";
        for(int i=start_index;i<end_index;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "hello World";
        // user defined substring
        System.out.println(substring(str,0,4));
        // predefined substring
        System.out.println(str.substring(0,3));
    }
}
