package Basic;

public class check {
    public static void main(String[] args) {
        float [] arr={1,45.8f,34.6f,34.8f,89.22f};
        float num=0;
        for(float  ele:arr){
            num+=ele;
        }
        System.out.print("num="+num);
    }
}
