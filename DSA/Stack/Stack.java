package DSA.Stack;

import java.util.*;
public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int k ;
    Stack(){
        top = -1;
    }

    public void push(int data){
        if(top >= MAX-1){
            System.out.println("stack is full");
        }else{
           top =top + 1;
            a[top] = data;
        }
    }
     int pop(){
         if( top == -1){
             System.out.println("stack is empty");
             return 0;
         }
         else{
             k = a[top];
             top = top -1;
           
         }return k;

    }
       
     int peek(){
        if( top == -1){
            System.out.println("stack is empty");
            return 0;
        }else {
         k = a[top];
        } return k;
    }
     void print(){
   for(int i =top; i >= 0 ; i--){
       System.out.print(a[i]+ " " + "\n");
   }
    }

   public static void main(String[]args){
    Stack s =new Stack();
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
