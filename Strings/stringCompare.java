package Java.strings;

public class stringCompare {
    public static void main(String[] args) {
        String str = "Ayush";
        String str2 = "Ayush";
        String str3 = new String("Ayush");

        if(str==str2){
            System.out.println("str & str2 are equal");
        }
        else {
            System.out.println("str & str2 are not equal");
        }

        if(str==str3){
            System.out.println("str & str3 are equal");
        }
        else{
            System.out.println("str & str3 are not equal");
        }

        if(str.equals(str3)){
            System.out.println("str & str3 are equal");
        }
        else {
            System.out.println("str & str3 are equal");
        }
    }
}
