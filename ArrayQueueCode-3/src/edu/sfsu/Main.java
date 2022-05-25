package edu.sfsu;

import java.util.Scanner;

public class Main {
    static void PrintQueue(ArrayQueue<Integer> q){
        ArrayQueue<Integer> temp = new ArrayQueue();
        while(!q.isEmpty()){
            int item= q.dequeue();
            temp.enqueue(item);
            System.out.print(item+" ");
        }

        System.out.println(" ");

        while(!temp.isEmpty())
            q.enqueue(temp.dequeue());
    }
    public static void main(String[] args) {
        ArrayQueue<Integer> q = new ArrayQueue();
        // q.
        int choice = -1;

        do {
            System.out.println("[1] To add an item into the queue");
            System.out.println("[2] To remove an item from the queue");
            System.out.println("[3] To print the front of queue");
            System.out.println("[4] To check of queue is empty");
            System.out.println("[5] To print queue contents");
            System.out.println("[6] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item");
                    int num = in.nextInt();
                    q.enqueue(num);
                    break;
                case 2:
                    if (!q.isEmpty()) {
                        q.dequeue();
                    }
                    break;
                case 3:
                    if(!q.isEmpty())
                        System.out.println("Front of the queue is " + q.getFront());
                    else
                        System.out.println("Queue is empty ");
                    break;
                case 4:
                    if(q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    PrintQueue(q);
                    break;
                case 6:
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-6]");
                    break;
            }
        } while (choice != 6);

    }
}
