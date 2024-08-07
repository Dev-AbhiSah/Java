import java.util.*;
class Queue{
    int front;
    int rear;
    int arr[];
    int size;
    int count;
    Queue(int capacity){
        front = 0 ;
        rear = 0;
        size = capacity;
        count =0;
        arr = new int[size];
    }
    boolean isFull(){
        if(count==size){
            System.out.println("Queue is full");
            return true;
        }else{
            return false;
        }
    }
    boolean isEmpty(){
        if(count==0){
            System.out.println("Queue is empty !");
            return true;
        }
        else return false;
    }
    void add(int val){
        if(isFull()) return;
        else{
            arr[rear++] = val;
            count++;
            System.out.println(val +" added to queue successfully");
        }
    }
    int pop(){
        if(isEmpty()) return -1;
        else{
            int x =arr[0];
            for(int i= 1;i<rear;i++)
            arr[i-1] = arr[i];
            rear--;
            arr[rear] =0;
            count--;
            return x;
        }
    }
    int peek(){
        if(isEmpty()) return -1;
        else return arr[0];
    }
    int queuelength(){
        return count;
    }
    void display(){
        System.out.println(Arrays.toString(arr));
    }
}
public class QueueArray {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        boolean terminate = false;
        Queue queue = new Queue(6);
        while (!terminate) {
            System.out.println("Operations on Queue: ");
            System.out.println("1 to add");
            System.out.println("2 to remove");
            System.out.println("3 to peek");
            System.out.println("4 to check is full");
            System.out.println("5 to check is empty");
            System.out.println("6 to check elements");
            System.out.println("7 to check Queue length");
            System.out.println("8 to terminate");

            int ch = ob.nextInt();
            int x = 0;
            switch (ch) {
                case 1:
                    x = ob.nextInt();
                    queue.add(x);
                    break;
                case 2:
                    x = queue.pop();
                    System.out.println(x + " is removed from Queue");
                    break;
                case 3:
                    x = queue.peek();
                    if(x!=-1)
                    System.out.println(x + "is front in Queue");
                    break;
                case 4:
                    if (!queue.isFull())
                        System.out.println("Queue is not full");
                    // else
                    //     System.out.println("Queue is not full");
                    break;
                case 5:
                    if (!queue.isEmpty())
                        System.out.println("Queue is not empty");
                    // else
                    //     System.out.println("Queue is not empty");
                    break;
                    case 7:
                    System.out.println(queue.queuelength()+" elements in queue");
                    break ;
                case 8:
                    terminate = true;
                    break;
                case 6:
                    queue.display();
                    break;
                default:
                    System.out.println("Choose valid choice");
                    break;

            }
        }

    }
}
