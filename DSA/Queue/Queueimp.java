package DSA.Queue;
public class Queueimp {
    static class QueT{
    static int[] arr;
        static int size;
        static int rear = -1;
  
        QueT(int n) {
          arr = new int[n];
          this.size = n ;
    }
    public static boolean isEmpty(){
        return rear == -1;
       }
   
       public static void Add(int data){
           if(rear >= size-1){
               System.out.println("Full Queue");
               return;
           }
           rear++;
           arr[rear]=data;
       }
       public static int delete(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[0];
       for(int i = 0 ;  i < rear ; i++){
           arr[i] = arr[i+1];
       }
       rear--;
       return front;
       }
   
       public static int peek() {
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
   
           return arr[0];
   
       }
}

    

    public static void main(String[] args){
     QueT q = new QueT(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(6);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.delete();
        }
    }
}
