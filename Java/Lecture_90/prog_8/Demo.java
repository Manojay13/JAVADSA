/*
public interface java.util.NavigableSet<E> extends java.util.SortedSet<E> {
  public abstract E lower(E);
  public abstract E floor(E);
  public abstract E ceiling(E);
  public abstract E higher(E);
  public abstract E pollFirst();
  public abstract E pollLast();
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.NavigableSet<E> descendingSet();
  public abstract java.util.Iterator<E> descendingIterator();
  public abstract java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public abstract java.util.NavigableSet<E> headSet(E, boolean);
  public abstract java.util.NavigableSet<E> tailSet(E, boolean);
  public abstract java.util.SortedSet<E> subSet(E, E);
  public abstract java.util.SortedSet<E> headSet(E);
  public abstract java.util.SortedSet<E> tailSet(E);
}
*/
class Demo{
	public static void main(String[] args){
		java.util.NavigableSet ns = new java.util.TreeSet();
		
		ns.add(10);		
		ns.add(20);		
		ns.add(14);		
		ns.add(27);		
		ns.add(23);	

		System.out.println(ns);

		//lower()
		System.out.println(ns.lower(23));	
		System.out.println(ns.lower(25));	
		System.out.println(ns.lower(9));	

		//floor()
		System.out.println(ns.floor(23));	
		
		//ceiling()
		System.out.println(ns.ceiling(25));	
		
		//higher()
		System.out.println(ns.higher(25));	
		
		//pollFirst()
		System.out.println(ns.pollFirst());	
		
		//pollLast()
		System.out.println(ns.pollLast());	

		System.out.println(ns);


		//descendingSet
		System.out.println(ns.descendingSet());	
		
		java.util.Iterator itr = ns.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//descendingIterator
		java.util.Iterator itr1 = ns.descendingIterator();

		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

		//subSet();
		System.out.println(ns.subSet(10,true,27,false));
	}
}
