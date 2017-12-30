package com.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("A");//Insert-Throws exception
		queue.offer("B");//Insert-Returns special value
		System.out.println(queue);//[A, B]
		System.out.println(queue.size());//2
		System.out.println(queue.peek());//A
		System.out.println(queue.element());//A
		System.out.println(queue.remove());//A
		System.out.println(queue);//[B]
		System.out.println(queue.peek());//B
		System.out.println(queue);//[B]
		System.out.println(queue.remove());//B
		System.out.println(queue);//[]
		//queue.offer(null);//java.lang.NullPointerException
		queue.clear();
		//System.out.println(queue.peek());// null
		//System.out.println(queue.element()); //NoSuchElementException
		//System.out.println(queue.peek());//null
		//System.out.println(queue.remove());////NoSuchElementException
		
	}

}
