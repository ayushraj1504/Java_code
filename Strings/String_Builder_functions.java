package Java.strings;

public class String_Builder_functions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);  //get
        System.out.println(ch);

        sb.insert(2,'y');  //insert
        System.out.println(sb);

        sb.setCharAt(2,'z');   //update
        System.out.println(sb);

        sb.deleteCharAt(2);  //remove
        System.out.println(sb);

        sb.append(1);  //add at last
        System.out.println(sb);

        System.out.println(sb.length());  //to find length

        int n = 100000;
        long start = System.currentTimeMillis();
        String s = "";
        for(int i=0;i<n;i++){
            s+=i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Duration for insertion in string: " + " " + duration);

        long start1 = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<n;i++){
            sb1.append(i);
        }
        long end1 = System.currentTimeMillis();
        long duration1 = end1 - start1;
        System.out.println("Duration for insertion in string Builder: " + " " + duration1);


    }
}
