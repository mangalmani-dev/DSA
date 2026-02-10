package oops;

public class Student {
    String name;
    private int rno;
    double percentage;
   final String schoolName = "ABC";


    // constructor
     public Student(){

     }


    public Student (String name , int rno , double percentage){
        this.name =name;
         this.rno = rno;
         this.percentage = percentage;
    }






    // function
    public int getRno(){
        return rno;           // getter
    }

    public void setRno(int roll){
      rno = roll;           // getter
    }

}
