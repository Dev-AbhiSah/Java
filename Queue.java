import java.util.*;

class MyQueue {
    int size;
    int count;
    int front;
    int rear;
    int arr[];

    MyQueue(int capacity) {
        size = capacity;
        arr = new int[capacity];
        count = 0;
        rear = 0;
        front = 0;
    }

    boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (count == size)
            return true;
        else
            return false;
    }

    void add(int val) {
        if (isFull()) {
            System.out.println("Queue is full !");
        } else {
            count++;
            arr[rear % size] = val;
            rear++;
            System.out.println(val + " is succesfully added");
        }
    }

    int remove() {
        int x = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            count--;
            x = arr[front % size];
            arr[front % size] = 0;
            front++;
            return x;
        }
    }

    int peek() {
        return arr[front % size];
    }

    void display() {
        System.out.println(Arrays.toString(arr));
    }
}

public class Queue {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        boolean terminate = false;
        MyQueue queue = new MyQueue(6);
        while (!terminate) {
            System.out.println("Operations on Queue: ");
            System.out.println("1 to add");
            System.out.println("2 to remove");
            System.out.println("3 to peek");
            System.out.println("4 to check is full");
            System.out.println("5 to check is empty");
            System.out.println("6 to check elements");
            System.out.println("7 to terminate");

            int ch = ob.nextInt();
            int x = 0;
            switch (ch) {
                case 1:
                    x = ob.nextInt();
                    queue.add(x);
                    break;
                case 2:
                    x = queue.remove();
                    System.out.println(x + " is removed from Queue");
                    break;
                case 3:
                    x = queue.peek();
                    System.out.println(x + "is front in Queue");
                    break;
                case 4:
                    if (queue.isFull())
                        System.out.println("Queue is full");
                    else
                        System.out.println("Queue is not full");
                    break;
                case 5:
                    if (queue.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Queue is not empty");
                    break;
                case 7:
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
