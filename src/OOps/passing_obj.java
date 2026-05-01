package OOps;
class sss{
    sss(){
        System.out.println("hello abhi");
    }
}
class bb extends sss{
    bb(){
        System.out.println("hello mohit");
    }
}
class cc extends bb {
    cc(){
        System.out.println("hello aman");
    }
}

public class passing_obj {
    public static void main(String[] args) {
        cc a=new cc();
    }

}
