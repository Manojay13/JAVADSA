class Demo{
	public static void main(String[] args){
		java.util.Deque dq = new java.util.ArrayDeque();

		dq.offer(10);
		dq.offer(40);
		dq.offer(20);
		dq.offer(30);

		System.out.println(dq);

		//offerFirst()
		dq.offerFirst(5);
		//offerLast()
		dq.offerLast(50);
		System.out.println(dq);

		//pollFirst()
		dq.pollFirst();
		//pollLast()
		dq.pollLast();
		System.out.println(dq);

		//peekFirst()
		System.out.println(dq.peekFirst());
		//pollLast()
		System.out.println(dq.peekLast());
		System.out.println(dq);

		//Iterator
		java.util.Iterator itr = dq.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//descendingIterator
		java.util.Iterator itr1 = dq.descendingIterator();

		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
