package oops;

public class fraction {
    public static class  Fraction{
         int num ;
         int deno ;
         public Fraction(int num , int deno){
             this.num=num;
             this.deno=deno;
         }

         public void simplify(int num , int deno){
             if(num<deno){
                 if(deno%num==0)
                 deno= deno/num;
                 num=1;
             }
         }

    }
    public static void main(String[] args) {
    Fraction f1 = new Fraction(3,7);
        System.out.println(f1.num +"/"+ f1.deno);
        f1.simplify(3,7);
    }
}
