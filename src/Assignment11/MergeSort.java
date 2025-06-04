package Assignment11;

public class MergeSort {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null ;
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
    static Node mergeNode(Node head1 , Node head2 , Node head3) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = head3;
        Node dummy = new Node(0);
        Node cur = dummy;
        while(temp1 != null && temp2 != null && temp3 != null) {
            if (temp1.data <= temp2.data && temp1.data <= temp3.data) {
                Node temp = new Node(temp1.data);
                cur.next = temp;
                cur = cur.next;
                temp1 = temp1.next;
            }
            else if (temp2.data < temp3.data  ) {
                Node temp = new Node(temp2.data);
                cur.next = temp;
                cur = cur.next;
                temp2 = temp2.next;
            }
            else {
                Node temp = new Node(temp3.data);
                cur.next = temp;
                cur = cur.next;
                temp3 = temp3.next;
            }

        }
        if(temp1 != null) {
            cur.next = temp1;
            cur = cur.next;
        }
        if(temp2 != null) {
            cur.next = temp2;
            cur = cur.next;
        }
        if(temp3 != null){
            cur.next = temp3;
            cur = cur.next;
        }
        return dummy.next;
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null ){
            System.out.print(" "+temp.data);
            temp =temp.next;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,4,5,7};
        int [] arr1 = {1,3,4,8};
        int [] arr2 = {2,6};
        Node head1 = createNode(arr);
        Node head2 = createNode(arr1);
        Node head3 = createNode(arr2);

        Node head = mergeNode(head1,head2,head3);

        display(head);
    }
}
