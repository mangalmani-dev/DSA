package methods;

public class multiple {
       // first functions
    public  static void fun1(){
        fun2();
        System.out.println("hello Mangalmani");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        fun3();
    }

      // main functions
    public static void main(String[] args) {
        System.out.println("yo yo");
         fun1();    // call
        fun2();
        System.out.print("nobita");
    }
     // second functions
    public  static void fun2(){
        System.out.println("hello jee");
    }

    // third functions
    public static void fun3(){
        System.out.println("kiya hal hai bhidu");
    }
}
