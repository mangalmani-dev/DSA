package Queues;

public class circularQueueArray {
    public static class Cqa{
        int front  =-1;
        int rare = -1;
        int size =0;
        int [] arr = new int[5];
        public void add (int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            } else if (size==0) {
                front=rare=0;
                arr[0]= val;
            } else if (rare<arr.length-1) {  // normal case
                 arr[++rare]=val;
            } else if (rare == arr.length-1) {
                 rare =0;
                 arr[0]=val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val = arr[front];
                if(front== arr.length-1){
                    front=0;
                }
                else{
                    front++;
                }
                size--;
                return val;
            }


        }
        public int peek()throws Exception{
             if(size==0){
                 throw  new Exception("Queue is empty");
             }
             else {
                 return arr[front];
             }
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            } else if (front<rare) {
                for (int i = front; i <=rare ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for (int i = front; i <=arr.length-1 ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <=rare ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
  Cqa c1 = new Cqa();
  c1.display();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        c1.display();
        c1.remove();
        c1.add(60);
        System.out.println();
        c1.display();

        System.out.println();
        System.out.println();
        for (int i = 0; i < c1.arr.length; i++) {
            System.out.println(c1.arr[i]);
        }


    }
}
