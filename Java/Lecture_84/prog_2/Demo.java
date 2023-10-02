//import java.util.*;

class Demo extends java.util.ArrayList{
	public static void main(String[] args){
		//java.util.ArrayList al = new java.util.ArrayList();
		Demo al = new Demo();
		
		//add(Element)
		al.add(10);
		al.add(20.5f);
		al.add("MK");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);
		
		//public int size();
		System.out.println(al.size());

		//public boolean contains(Object)
		System.out.println("al.contains(20.5)="+al.contains(20.5));
		System.out.println("al.contains(20.5f)"+al.contains(20.5f));

		//public int indexOf(Object)
		System.out.println("al.indexOf(20.5)="+al.indexOf(20.5));
		System.out.println("al.indexOf(20.5f)="+al.indexOf(20.5f));

		//public int lastIndexOf(Object);
		System.out.println("al.lastIndexOf(20.5))="+al.lastIndexOf(20.5));
		System.out.println("al.lastIndexOf(20.5f))="+al.lastIndexOf(20.5f));

		//public E get(int)
		System.out.println("al.get(1)="+al.get(1));


		//public E set(int,E)	
		System.out.println("al.set(0,2)="+al.set(0,2));
		System.out.println(al);

		//public void add(int,E)
		System.out.print("al.add(0,9)==");
		al.add(0,9);
		System.out.println(al);

		//public E remove(int)	
		System.out.println("al.remove(0)="+al.remove(0));
		System.out.println(al);
		
		//public boolean remove(Object)	
		System.out.println("al.remove(10)="+al.remove(al.get(3)));
		System.out.println(al);

		java.util.List al2 = new java.util.ArrayList();
		
		//add(Element)
		al2.add(10);
		al2.add(20.5f);
		al2.add("MK");
		al2.add(10);
		al2.add(20.5f);


		//public boolean addAll(Collection)	
		System.out.println("al.addAll(al2)="+al.addAll(al2));
		System.out.println(al);
		
		//public boolean addAll(int,Collection)	
		System.out.println("al.addAll(2,al2)="+al.addAll(2,al2));
		System.out.println(al);

		//protected void removeRange(int,int)
		al.removeRange(2,5);
		System.out.println(al);

		//Object toArray()
		System.out.println(al.toArray());
		Object[] arr = al.toArray();
		for(Object a: arr)
			System.out.print(a+" ");
	
		System.out.println();
		al.clear();
		System.out.println(al);	

	}
}
