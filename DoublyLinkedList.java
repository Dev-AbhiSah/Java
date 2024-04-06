import java.util.*;

class DoubleLL {
    Node head;
    Node tail;
    int count;
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            next = null;
            prev = null;
            data = val;
        }
    }

    DoubleLL(){
        head =null;
        tail =null;
        count =0;
    }
    boolean isEmpty()
    {
        if(head == null)
        return true;
        return false;
    }
    void addAll(int arr[]){
        for(int i=0;i<arr.length; i++)
        {
            Node freshNode = new Node(arr[i]);
            if(isEmpty()){
                head = freshNode; 
                tail = freshNode;
            }else{
                tail.next = freshNode;
                freshNode.prev = tail;
                tail= freshNode; 
            }
            count++;
        }
    }
    void add(int val){
        Node freshNode = new Node(val);
            if(isEmpty()){
                head = freshNode; 
                tail = freshNode;
            }else{
                tail.next = freshNode;
                freshNode.prev = tail;
                tail= freshNode; 
            }
            count++;
    }
    void insert(int pos, int val){
        if(pos < 0 || pos>count)
        {
            System.out.println("Provide valid place to insert !: "+pos);
            return;
        }
        
        if(isEmpty() && pos ==0 || pos == count)
        {
            add(val);
        }else if(!isEmpty() && pos == 0)
        {
            Node freshNode = new Node(val);
            freshNode.next = head;
            head.prev = freshNode;
            head = freshNode;
            count++;
        }
        else{
            Node temp = head;
            Node freshNode = new Node(val);
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            freshNode.next = temp.next;
            freshNode.next.prev = freshNode;
            freshNode.prev = temp;
            temp.next =freshNode;
            count++;
        }
    }
    void show(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" --> ");
            temp = temp.next;
        }
        System.out.println(count);
    }
    void reverseShow(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data +" --> ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
public static void main(String args[]){
    int arr[]={1, 2, 3, 4, 5, 6, 7};
    DoubleLL ll1 = new DoubleLL();
    ll1.addAll(arr);
    ll1.show();
    ll1.add(8);
    ll1.add(9);
    ll1.add(10);
    ll1.insert(5, 55);
    ll1.insert(11, 110);
    ll1.insert(0, 0);
    ll1.show();
    ll1.reverseShow();
}
}
