package DSA.Stack_LL;
import java.util.*;
public class Stack {
    static Node top;    //head of the linkedlist 
    static class Node{    //Node holding the data and the next part 
      int data;
      Node next;
    }
    Stack(){
        this.top = null;
    }
    Node temp;
public void push(int data){
    Node n = new Node(); 
    if(n == null){
        System.out.println("stack is overflow, Can't Insert Element");
        return;
    }else{
       n.data = data;
       n.next = top;
       top = n;
    }
}
public int pop(){
    if(top == null){
        System.out.println("stack is underflow, Can't pop out the element");
        return -1;
    }else{
        temp = top;
        top = top.next;
    }return temp.data;
}

public int peek(){
    if(top ==null){
        System.out.println("stack is underflow, Can't peek out the element");
    }
        return top.data;
}
public void print(){
    System.out.println("elements present in stack are");
    while(top != null){
        System.out.print(top.data + " ");
        top =top.next;
    }
}

public static void main(String[] args){
    Stack s = new Stack();
    Scanner sc = new Scanner(System.in);
    System.out.println("please press 1 to enter");
    int option = sc.nextInt();
    while(option != 5){
        System.out.println("please enter the option 1.push 2.pop 3.peek 4.show 5.exit");
        option = sc.nextInt();
    switch(option){
        case 1 :
         System.out.println("Enter the Element");
         s.push(sc.nextInt());
         System.out.println("Element inserted Successfully");
         break;
         case 2 :
         System.out.println("Element " + s.pop()+ " from stack poped Successfully");
         break;
         case 3 :
         System.out.println("Element " + s.peek()+ " from stack peeked Successfully");
         break;
         case 4 :
         s.print();
         break;
         case 5:
            System.exit(0);
            break;
         default :
         System.out.println("please enter the right option");
         break;
         
    }
    
}
   
}
}
