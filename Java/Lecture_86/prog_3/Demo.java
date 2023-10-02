class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		java.util.Iterator itr = al.iterator();

		System.out.println("one::"+itr.next());
		System.out.println("two::"+itr.next());
		System.out.println("two::"+itr.next());
		System.out.println("two::"+itr.next());
		//System.out.println("two::"+itr.next()); 
		/*
		Exception in thread "main" java.util.NoSuchElementException
	at java.util.ArrayList$Itr.next(ArrayList.java:864)
	at Demo.main(Demo.java:15)
		*/
		System.out.println(itr.hasNext());

		System.out.println(itr.getClass());
		//System.out.println(itr.next());
	}
}
