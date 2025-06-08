package Assignment14;

import java.util.Scanner;

public class QueueUsingArrays {
    static int[] queue = new int[100];  // fixed-size queue
    static int front = 0;
    static int rear = 0;

    // Enqueue operation
    public static void enqueue(int data) {
        if (rear == 100) {
            System.out.println("Queue is full (Overflow)");
            return;
        }
        queue[rear] = data;
        rear++;
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public static void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty (Underflow)");
            return;
        }
        System.out.println(queue[front] + " dequeued");
        front++;
    }

    // Display operation
    public static void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose operation:\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int data = sc.nextInt();
                    enqueue(data);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}
