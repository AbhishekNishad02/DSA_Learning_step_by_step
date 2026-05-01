package linked_list;
class linklist{
    node head;
    node tail;
    int size;
    void addAtlast(int val){
        node temp=new node(val);
        if(head==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void display(){
        if(head==null) return;
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void addAthead(int val){
        node temp=new node(val);
        if(head==null) head=tail=temp;
        else{
        temp.next=head;
        head=temp;
        }
        size++;
    }
    void deleteAthead(){
        if(head==null) {
            System.out.println("linkist is empty");
            return;
        }

       head=head.next;
        if(head==null) tail=null;
        size--;
    }
    void delete(int idx){
        node temp=head;
       if(idx<0 || idx>=size)
           System.out.println("Invaild Index!");
       else if(idx==0) deleteAthead();
       else{
           for(int i=0;i<idx-1;i++){
               temp=temp.next;
           }
           temp.next=temp.next.next;
           if(idx==size-1) tail=temp;
           size--;
       }
    }
    void search(int val){
        node temp=head;
        if(head==null) {System.out.println("list is empty");
        return ;
        }
      for(int i=0;i<size;i++){
          if(temp.data==val){ System.out.println("Mil gya ");
          return;
          }
          temp=temp.next;
      }
    }
    void insert(int val,int idx){
        if(idx<0 || idx>size) System.out.println("Invalid Index!");
        else if (idx==0) addAthead(val);
        else if (idx==size) addAtlast(val);
        else {
            node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;

            }
            node t=new node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    void getele(int idx){
        node temp=head;
        if(idx<0 || idx>size) {System.out.println("Invalid index" );
            return;
        }
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

}
public class DS_linklist {

    public static void main(String[] args) {
        linklist a = new linklist();
        a.addAtlast(10);
        a.addAtlast(20);
        a.addAtlast(30);
        a.addAtlast(40);
        a.addAtlast(50);
        a.addAthead(100);
        a.display();
       a.search(30);
        a.insert(45,3);
        a.display();
        a.display();
        a.getele(3);
        a.delete(3);
        a.display();
        a.delete(5);
        a.display();



    }

}
