package Heaps;

import java.util.Arrays;

public class customCompator {
    public static class Student implements Comparable<Student>{
        int rno;
        int marks;
        String name;
        Student(int rno , int marks , String name){
            this.rno=rno;
            this.marks=marks;
            this.name=name;
        }
        public int compareTo(Student s){
            return this.rno-s.rno;  // yeh integer he rehna chaiye
        }
    }

    public static void print(Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].rno+" ");
            System.out.print(arr[i].marks+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
          Student [] s = new Student[4];
          s[0]= new Student(48,86,"Mangalmani");
           s[1]= new Student(49,66,"Shivam");
          s[2]= new Student(45,96,"Raj");
          s[3]= new Student(30,72,"Devesh");
           print(s);
        Arrays.sort(s);
        System.out.println("After custom comparater");
        print(s);


    }
}
