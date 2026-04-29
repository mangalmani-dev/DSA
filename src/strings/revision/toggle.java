package strings.revision;

public class toggle {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("mAnGaLmAnI");
        for (int i = 0; i < sb.length(); i++) {
          char ch = sb.charAt(i);
          int ascii = (int) ch;
          if(ascii >=65 && ascii <=90){
              ascii+=32;
              sb.setCharAt(i,(char)ascii);
          }
         else if(ascii>= 97 && ascii<=122){
              ascii-=32;
              sb.setCharAt(i,(char)ascii);
          }
        }
        System.out.println(sb);

    }
}
