package oops;

public class userDefinedDataType {
//    public  static class Student {
////        String name;
////          int rno;
////        double percentage;
//    }
    public static void fun(Student s1){
       s1.name = "sushant";
       return;
    }

    public static void main(String[] args) {

        Student s1 = new Student("sushant",23,53.5);

        System.out.println(s1.name);


//        Student s1 = new Student();
//        s1.name= "Mangalmani";
////        s1.rno = 23;
//        s1.percentage=87.2;
//        System.out.println(s1.getRno());
//        s1.setRno(90);
//        System.out.println(s1.getRno());
    }
}
