/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueintro;

import java.util.*;

/**
 *
 * @author abeer
 */
public class QueueIntro {

     static void printStack(Queue q) {
        Queue<Integer> backup;
         backup = new LinkedList<>();
        System.out.println("Queue contents:");
        while (q.size()!=0) {
            int t = (Integer)q.peek();
            q.remove();
            backup.add(t);
            System.out.print(t + " ");
        }
        System.out.println();
        
        int s = backup.size();
        for(int i=0;i<s;i++){
            q.add(backup.peek()); backup.remove();}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> q = new LinkedList<>();
        int choice = -1;

        do {
            System.out.println("[1] To add an item into the queue");
            System.out.println("[2] To remove an item from the queue");
            System.out.println("[3] To print the front of queue");
            System.out.println("[4] To check if queue is empty");
            System.out.println("[5] To print queue contents");
            System.out.println("[6] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item");
                    int num = in.nextInt();
                    q.add(num);
                    break;
                case 2:
                    if (q.size()!=0) {
                        q.remove() ;
                    }
                    break;
                case 3:
                    if(q.size()!=0)
                    System.out.println("Front of the queue is " + q.peek());
                    else
                        System.out.println("Queue is empty");
                    break;
                case 4:
                   if(q.size()!=0) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    printStack(q);
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
