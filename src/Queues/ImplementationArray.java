package Queues;

public class ImplementationArray {
    public static class queueA{
         int [] arr = new int[50];
         int front =-1;
         int rare =-1;
         int size =0;

         public void add(int val){
             if(rare == arr.length-1){
                 System.out.println("queue full hogaya hai");
                 return;
             }
             if(front==-1){
                 front=rare=0;
                 arr[rare]=val;

             }
             else{
                 arr[++rare]=val;

             }
             size++;
         }

         public int remove(){
             if(size==0){
                 System.out.println("Unable to remove");
             }
          int x = arr[front];
          front++;
          size--;
          return x;
         }

         public int peek(){
             return arr[front];
         }

         public void display(){
             if(size==0){
                 System.out.println("queue is empty");
             }
             else{
                 for (int i = front; i <=rare ; i++) {
                     System.out.print(arr[i]+" ");
                 }
             }
             System.out.println();
         }

    }
    public static void main(String[] args) {
   queueA q = new queueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);



    }
}
