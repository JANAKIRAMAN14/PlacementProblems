package Assignment11;
import java.util.*;
public class DeleteNode {
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
    static Node deleteNode(Node head ,int k){
        Node temp = head;
        Node pre  = null;
        while(temp != null){
            if(temp.data == k) pre.next = temp.next;
            pre = temp;
            temp = temp.next;
        }
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 3;
        Node head = createNode(arr);
        Node head1 = deleteNode(head,k);
        display(head1);
    }
}
