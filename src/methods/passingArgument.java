package methods;

public class passingArgument {
    public static void greet(String name){
        System.out.println("Hi" +" " +name);
    }
    public static void main(String[] args) {
        greet("Modi");
        greet("mangalmani");
        sum(5,4);
        intro("mangalmani",23);
    }

    public  static void sum(int a,int b){
        System.out.println(a+b);
    }


    public  static void intro(String name,int age){
        System.out.println(name + " "+ age);
    }
}
