package linked_list;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
    node(){

    }
}

public class basic {
    public static void recursion(node head){
        if(head ==null) return;
        System.out.print(head.data+" ");
        recursion(head.next);
    }
    public static void display(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void get(node head,int idx){
        node temp=head;
        for (int i=0;i<idx;i++){
            temp=temp.next;
        }
        System.out.println("\n"+temp.data+" ");
    }
    public static void main(String[] args) {


        node a = new node(15);
        node b = new node(20);
        node c = new node(25);
        node d = new node(30);
        node e = new node(35);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        recursion(a);
        System.out.println("\nwithout recursion");
        display(a);
        get(a,3);

    }
}