package Stack;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(12);
        st.push(89);
        int ele=40;
        st.push(22);
        pushAtbottom(st,ele);
        System.out.println("add element in bottom");
        System.out.println(st);
        reverseStack(st);
        System.out.println("After rever Stack ");
        System.out.println(st);
    }
public static void pushAtbottom(Stack<Integer> st,int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
          int t=0;
         t=st.pop();
        pushAtbottom(st,ele);
       st.push(t);
}
public static void reverseStack(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverseStack(st);
        pushAtbottom(st,top);
}

}