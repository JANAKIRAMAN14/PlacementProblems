package Assignment11;
import java.util.*;
public class OrderDuplicates {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node createNode(int [] arr){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i = 1 ;  i < arr.length ; i++){
           Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }
        return head;
    }
    static void display(Node head){
       Node temp = head;
        while(temp != null ){
            System.out.print(" "+temp.data);
            temp =temp.next;
        }
    }
    static Node removeDuplicats(Node head){
        Set<Integer> dup = new HashSet<>();
        Node temp = head;
        Node res = new Node(0);
        Node cur = res;
        while(temp != null){
            if(!dup.contains(temp.data)){
                 dup.add(temp.data);
                 cur.next = temp;
                 cur = cur.next;
            }

            temp = temp.next;
        }
       cur.next = null;
        return res.next;
    }
    public static void main(String[] args) {
          int [] arr = {1,1,2,2,3,3,3,4,4,5,5};

          Node head = createNode(arr);
          Node head1 = removeDuplicats(head);
          display(head1);
    }
}
