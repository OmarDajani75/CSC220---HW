package edu.sfsu;
import java.util.*;
public class Main {
	public static void mirror(Queue<Integer> q){
		Queue<Integer> temp1 = new LinkedList<>() ;
		Stack<Integer> temp2 = new Stack<>() ;

		while(!q.isEmpty()){
		temp1.add(q.peek());
		temp2.push(q.remove()) ;
		}
		while(!temp1.isEmpty()) q.add(temp1.remove()) ;
		while(!temp2.isEmpty()) q.add(temp2.pop()) ;
	}
	public static void stutter(Queue<Integer> q){
	Queue<Integer> temp = new LinkedList<>() ;
	while(!q.isEmpty()){
		temp.add(q.peek());
		temp.add(q.remove());
	}
	while(!temp.isEmpty())
		q.add(temp.remove()) ;
}
    public static void main(String[] args) {
		PriorityQueue<Customers> pq = new PriorityQueue<>() ;
		pq.add(new Customers("John", 8));
		pq.add(new Customers("Tom", 1));
		pq.add(new Customers("Sam", 5));
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
//	Queue<Integer> q = new LinkedList<>() ;
//	PriorityQueue<Integer> pq = new PriorityQueue<>() ;
//	q.add(3);
//	q.add(2);
//	q.add(1);
//	q.add(4);
//	pq.add(3);
//	pq.add(2);
//	pq.add(1);
//	pq.add(4);
//	while(!q.isEmpty()) System.out.print(q.remove()+" ");
//	System.out.println();
//	while(!pq.isEmpty()) System.out.print(pq.poll()+" ");

//mirror(q);
//		System.out.println(q);

    }
}
