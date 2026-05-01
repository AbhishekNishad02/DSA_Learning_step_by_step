package Method;

public class return_fun {
    public static int aaa(int a ) {
        System.out.println("Aman");
        if(a<5) return 4;
        return 5;

    }
    public static void main(String[] args) {
        System.out.print("hello ");

        int x=aaa(6);
        System.out.println(10+x);

    }
}