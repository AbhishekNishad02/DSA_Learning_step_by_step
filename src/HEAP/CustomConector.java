package HEAP;

import java.util.Arrays;

class student implements  Comparable<student>{
    String name;
    int rno;
    double cgpa;

     public student(String name, int rno, double cgpa) {
         this.name = name;
         this.rno = rno;
         this.cgpa = cgpa;
     }

     public int compareTo(student s){
        // return this.rno-s.rno;
//         return Integer.compare(s.rno,s.rno);
         // return Double.compare(
      //   return (this.name.compareTo(s.name));
         return (int)(this.cgpa*10-s.cgpa*10);

     }
 }
public class CustomConector {
    public static void main(String[] args) {
        student s1 = new student("Amit", 5, 8.6);
        student s2 = new student("sanooj", 1, 7.4);
        student s3 = new student("haroon", 15, 9.2);
        student s4 = new student("Nikhil", 23, 8.0);
        student s5 = new student("Aayush", 23, 8.4);
        student[] a = {s1, s2, s3, s4, s5};
        Arrays.sort(a);
        System.out.println("\033[2;31mName          Roll.no          Cgpa\033[0m");

        for(student s: a){
            System.out.println(s.name+"\t\t\t"+s.rno+"\t\t\t\t"+s.cgpa);
        }

    }
}
