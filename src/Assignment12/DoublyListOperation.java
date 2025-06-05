package Assignment12;

public class DoublyListOperation {
    Node head;
    static class Node{
        int data;
        Node next;
        Node pre;

        Node(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }

    }
    public void  add(int data){
        Node newnode  = new Node(data);
        if(head == null) {
            head = newnode;
            //temp.pre = null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.pre = temp;

    }
    public void insertAtBegin(int data){
        Node temp = new Node (data);
        if(head == null){
            head = temp;
            return ;
        }
        Node res = head;
         res.pre = temp;
        temp.next = res;
        head = temp;
        }
    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode ;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.pre = temp;

    }
    public void positionadd(int data , int k){
        Node newnode = new Node(data);
        Node temp = head;
        int pos = 1;
        Node pre = null;
        while(temp != null){
            if(pos == k){
               newnode.next = temp;
               newnode.pre = pre;
               temp.pre = newnode;
               pre.next = newnode;
            }
            pre = temp;
            temp = temp.next;
            pos++;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       DoublyListOperation doublyListOperation = new DoublyListOperation();

       doublyListOperation.add(1);
       doublyListOperation.add(2);
       doublyListOperation.add(3);
       doublyListOperation.add(4);
       doublyListOperation.positionadd(3,3);
       doublyListOperation.insertAtBegin(7);
       doublyListOperation.insertAtEnd(6);
       doublyListOperation.positionadd(5,2);

       doublyListOperation.display();
    }
}
