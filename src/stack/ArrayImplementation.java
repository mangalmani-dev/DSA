package stack;


import java.util.Stack;

public class ArrayImplementation {

    public static class Stack{
        int [] arr = new int[5];
        int idx = 0;
      void push(int x){
          if(isFull()){
              System.out.println("Stack is full");
              return;
          }
            arr[idx]=x;
            idx++;
      }
      int peek(){
          if(idx==0) {
              System.out.println("Stack is empty");
              return -1;
          }else{
                  return arr[idx - 1];
              }

      }
      int pop(){
          if(idx ==0){
              System.out.println("Stack is empty");
              return -1;
          }
          else {
              int top = arr[idx-1];
              arr[idx-1]=0;
              idx--;
              return top;
          }
      }

      void display(){
          for (int i = 0; i <=idx-1; i++) {
              System.out.println(arr[i]+" ");
          }
      }

      int size(){
          return idx;
      }

      boolean isEmpty(){
          if(idx==0){
              return true;
          }
          else {
              return false;
          }
      }

      boolean isFull(){
          if(idx==arr.length){
              return true;
          }
          else {
              return false;
          }
      }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.push(50);
         st.display();
      



    }
}
