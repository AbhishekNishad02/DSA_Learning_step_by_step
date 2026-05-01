package Stack;
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
class Mstack{
    Node head;
    int len;
    Node tail;
    int peek()throws Exception{
        if(head==null){
            throw new Exception("StackIsUnderFlow Error");
        }
        return head.val;
    }
    int pop()throws Exception{
        if(head==null){
            throw new Exception("StackUnderFlow Error");
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int val){
        Node temp=new Node(val);
        if(len==0) head=tail=temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }
    void addAtbottom(int val){
        Node temp=new Node(val);
        if(head == null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }

}

public class Stack_list_imple {
    public static void main(String[] args)throws Exception {
        Mstack st=new Mstack();
      
        st.push(15);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        st.display();
        System.out.println("size "+ st.size());
        System.out.println();
        st.addAtbottom(1);
        st.display();


    }
}
