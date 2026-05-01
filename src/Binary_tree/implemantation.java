package Binary_tree;


import java.util.*;


class  Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class pair{
    int level;
    Node node;
    pair(Node node,int level){
        this.level=level;
        this.node=node;
    }
}

public class implemantation {
    static  boolean flag;
    public  static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }
    public static  int size(Node root){
        if(root == null) return 0;
        return 1+size(root.right)+size(root.left);
    }
    public static  int sum(Node root){
        if(root == null) return 0;
        return root.val+sum(root.right)+sum(root.left);
    }
    public static  int pro(Node root){
        if(root == null) return 1;
        return root.val*pro(root.right)*pro(root.left);
    }
    public static  int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static  int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static void main(String[] args) {
        /*    10
            /    \
          20     30
         /  \   /  \
       40  50  60   70
        */
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        System.out.println("PreOreder Display a Binary Tree:" );
        display(a);
        System.out.println( "\nSize of a tree "+size(a));
        System.out.println("Sum of all value : "+ sum(a));
        System.out.println("product of a tree: " + pro(a));
        System.out.println("Maximum Value in a tree: "+ max(a));
        System.out.println("Minimum VAlue in a Tree: "+ min(a));
        System.out.println("Level of a tree : "+ level(a));
        System.out.println("Inorder Display a Binary Tree:");
        Inorderdis(a);
        System.out.println("\nPostOrder Display a Binary Tree:");
        Postorder(a);
        System.out.println(" \nPrint In BFS");
        displayBFS(a);
        System.out.println("\nDisplay by level by level Using BFS");
       displaylevel(a);
        System.out.println("\nkTh level Element ");
        Kthlevel(a,0,2);
       System.out.println("\nPerfect Binary Tree: "+perfectBSt(a));
        System.out.println("\nBalance Binary Tree: "+BalanceBSt(a));

      
    }

    private static boolean BalanceBSt(Node root) {
        if (root == null) return true;
        flag = true;
        levelbst(root);
        return flag;
    }
    public static int levelbst(Node root){
        if(root==null) return 0;
        int left=levelbst(root.left);
        int right=levelbst(root.right);
        if(Math.abs(left-right)>1){ flag=false;
            return 0;
        }
        return 1+Math.max(left,right);
    }

    private static boolean perfectBSt(Node root) {
       int n=(int)Math.pow(2,level(root));
       int m=size(root);
       if(n-1==m) return true;
       return false;
    }

    private static void Kthlevel(Node root,int n,int k) {
        if(root==null) return;
        if(n==k){
            System.out.print(root.val+" ");
        }
        Kthlevel(root.left,n+1,k);
        Kthlevel(root.right,n+1,k);
    }

    private static void displaylevel(Node root) {
        Queue<pair> Q= new LinkedList<>();
        int currlevel=0;
        Q.add(new pair(root,0));
        while(Q.size()>0){
            pair temp=Q.remove();
            if(temp.level != currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(temp.node.val+" ");
            if(temp.node.left != null) Q.add(new pair(temp.node.left, temp.level+1));
            if(temp.node.right != null) Q.add(new pair(temp.node.right, temp.level+1));
        }
    }

    private static void displayBFS(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while ( q.size() > 0){
            Node temp=q.remove();
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

    }

    private static void Inorderdis(Node root) {
        if(root==null) return;
        Inorderdis(root.left);
        System.out.print(root.val+" ");
        Inorderdis(root.right);
    }
    private static int level(Node root) {
        if(root == null) return 0;
        return 1+Math.max(level(root.right),level(root.left));
    }
    private static void Postorder(Node root)  {
        if(root==null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");

    }
}
