package Strings;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("Abhishek" +" Nishad going");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(0,'M');
        System.out.println(s);
        String b=s.toString();
        System.out.println(b);


    }
}
