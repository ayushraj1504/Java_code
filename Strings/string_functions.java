package Java.strings;

public class string_functions {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1+" " +s2;
        System.out.println(s3);

        String s4 = "ayush";
        s4+=" ";
        s4+='r';
        s4+='a';
        s4+='j';
        s4+=" ";
        s4+= 15;
        System.out.println(s4);

        System.out.println(10 + 20 + " " + "hello");  // output is 30 hello, first it sum 10 and 20 and became 30 then 30 + hello(string) is 30 hello

        System.out.println("hello" + " " + 10 + 20);  // output is hello 1020, first add hello and 10 and became hello10(string) then add 20 as string and became hello1020

        String s5 = "abc, def,ghi jkl";
        String[] parts = s5.split(",");
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }

    }
}
