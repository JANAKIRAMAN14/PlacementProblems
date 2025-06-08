package Assignment14;
import Assignment11.DeleteNode;

import java.util.*;
public class QueueUsingList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node createNode(int [] arr){
        Node head = new Node(arr[0]);
       Node move = head ;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            move.next = temp ;
            move = move.next;
        }
        return head;
    }
    static Node enqueue(int data , Node head){
        Node newnode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }
    static Node dequeue(Node head){
        if(head == null) return head;
        return head.next;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       int [] arr = {10, 20, 30};
       Node head = createNode(arr);
       Node head1 = enqueue(40,head);
       //Node head2 = dequeue(head);
       display(head1);
    }
}
