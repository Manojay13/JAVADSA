class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		/*java.util.Iterator itr = al.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
		}*/

		System.out.println(al);

		//listIterator
		java.util.ListIterator ltr = al.listIterator();

		System.out.println(ltr.getClass().getName());

		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
			//System.out.println(ltr.next());
			/*
			 *Exception in thread "main" java.util.NoSuchElementException
	at java.util.ArrayList$Itr.next(ArrayList.java:864)
	at Demo.main(Demo.java:28)
i
			 * */
		}

		//Enumeration
		java.util.Vector v = new java.util.Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		java.util.Enumeration cursor = v.elements();
		System.out.println(cursor.getClass().getName());



	}
}
