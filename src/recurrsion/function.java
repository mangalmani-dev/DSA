package recurrsion;

public class function {
    public static void apple(){
        System.out.println("I am in apple");
    }
    public static void main(String[] args) {
        apple();
        System.out.println("I am in main method");
        apple();
    }
}
