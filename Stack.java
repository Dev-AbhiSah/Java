import java.util.*;
class MyStack{
    int arr[];
    int top;
    int count;
    int size;
    MyStack(int capacity){
        arr = new int [capacity];
        size =capacity;
        top =-1;
        count =0;
    }
    void push(int val)
    {
        if(count == size) System.out.println("Satck is full");
        else{
            arr[++top] = val;
            count++;
        }
    }
    int pop(){
        int x =-1;
        if(count == 0){
            System.out.println("Stack is empty");
            return x;
        }
        else{
            x = arr [top];
            top--;
            count--;
            return x;
        }
    }
    int peek(){
        int x =-1;
        if(count == 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }
    int isFull(){
        if(count==size){
            System.out.println("Stack is full");
            return 1;
        }else{
            return 0;
        }
    }
    int isEmpty(){
        if(count==0){
            System.out.println("Stack is empty");
            return 1;
        }else{
            return 0;
        }
    }
    void  display(){
    System.out.println(Arrays.toString(arr));
    }
}

public class Stack{
    public static void main(String args[]){
        MyStack stack =new MyStack(5);
        int terminate =0;
        while (terminate!=7){
            Scanner ob = new Scanner(System.in);
            System.out.println();
            System.out.println("Operations on stack: ");
            System.out.println("1 to push");
            System.out.println("2 to pop");
            System.out.println("3 to peek");
            System.out.println("4 to check is full");
            System.out.println("5 to check is empty");
            System.out.println("6 to see all element");
            System.out.println("7 to terminate");
            int ch = ob.nextInt();
            int x =0;
            switch(ch){
                case 1:
                int num = ob.nextInt();
                stack.push(num);
                break;
                case 2:
                x = stack.pop();
                if(x>0){
                    System.out.println(x+" is removed from stack");
                }
                break;
                case 3:
                x = stack.peek();
                if(x>0){
                    System.out.println(x+" is on top of stack");
                }
                break;
                case 4:
                x = stack.isFull();
                if(x == 0){
                    System.out.println("Stack is not full");
                }
                break;
                case 5:
                x = stack.isEmpty();
                if(x == 0){
                    System.out.println("Stack is not empty");
                }break;
                case 6:{
                    stack.display();
                }
                break ;
                case 7:
                System.out.println("Terminated succesfully");
                terminate =7;
                break;
                default:
                System.out.println("Do select valid choice");
            }
            }
        }
    }
