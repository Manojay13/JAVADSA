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
		//java.util.ArrayList ns = new java.util.ArrayList();		
		java.util.NavigableSet ns = new java.util.NavigableSet();		
		ns.add(11.22f);
		/*ns.add("MK");
		ns.add("SK");
		ns.add("PK");
		ns.add("IK");*/
		ns.add(11.33f);
		System.out.println(ns);
		//System.out.println(ns.lower("MK"));
		//System.out.println(ns.higher("MK"));
		System.out.println(ns.floor(11.22f));
		System.out.println(ns.ceiling(11.22f));
		//System.out.println(ns.get(0).getClass());
		//System.out.println(ns.get(1).getClass());
	}
}
