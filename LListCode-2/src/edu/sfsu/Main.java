package edu.sfsu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LList<Integer> list = new LList<>();
        int num, pos;
        int choice = -1;

        do {
            System.out.println("[1] To add an item into the list");
            System.out.println("[2] To add an item into a specific position in the list");
            System.out.println("[3] To remove an item from the list");
            System.out.println("[4] To remove an item at a specific position in the list");
            System.out.println("[5] To replace an item in the list");
            System.out.println("[6] To get an entry at specific position in the list");
            System.out.println("[7] To check if the list contains an element");
            System.out.println("[8] To get the length of the list");
            System.out.println("[9] To clear the list");
            System.out.println("[10] To Print the list content");
            System.out.println("[11] To Exit");
            System.out.println("Enter your choice:");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an item");
                    num = in.nextInt();
                    list.add(num);
                    break;
                case 2:
                    System.out.println("Enter an item");
                    num = in.nextInt();
                    System.out.println("Enter the position of the item");
                    pos = in.nextInt();
                    list.add(num, pos);
                    break;
                case 3:
                    list.remove();
                    break;
                case 4:
                    System.out.println("Enter the position of the item");
                    pos = in.nextInt();
                    list.remove(pos) ;
                    break;
                case 5:
                    System.out.println("Enter a new item");
                    num = in.nextInt();
                    System.out.println("Enter the position of the new item");
                    pos = in.nextInt();
                    list.replace(pos, num) ;
                    break;
                case 6:
                    System.out.println("Enter the position of the item you want to get");
                    pos = in.nextInt();
                    if(list.getEntry(pos)!=null) System.out.println("Item is: "+list.getEntry(pos));
                    else System.out.println("No item is this position");
                    break;
                case 7:
                    System.out.println("Enter an item to look for");
                    num = in.nextInt();
                    if(list.contains(num)) System.out.println("Item exists");
                    else System.out.println("Item does not exist");
                    break;
                case 8:
                    System.out.println("List of length:" + list.getLength());
                    break;
                case 9:
                    list.clear();
                    break;
                case 10:
                    PrintList(list);
                    break;
                default:
                    System.out.println("Invalid choice! Enter a number in the range [1-6]");
                    break;
            }
        } while (choice != 11);
    }

    static void PrintList(LList<Integer> l) {
        System.out.println("Elements in the List:");
        for (int i = 1; i <= l.getLength(); i++) {
            System.out.print(l.getEntry(i) + " ");
        }
        System.out.println();
    }

}
