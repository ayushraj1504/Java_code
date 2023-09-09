package Java.strings;

public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length();i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        String str2 = "ayush";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
    }
}
