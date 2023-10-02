/*Compiled from "SortedSet.java"
public interface java.util.SortedSet<E> extends java.util.Set<E> {
  public abstract java.util.Comparator<? super E> comparator();
  public abstract java.util.SortedSet<E> subSet(E, E);
  public abstract java.util.SortedSet<E> headSet(E);
  public abstract java.util.SortedSet<E> tailSet(E);
  public abstract E first();
  public abstract E last();
  public java.util.Spliterator<E> spliterator();
}
*/

class Demo{
	public static void main(String[] args){
		java.util.SortedSet ss = new java.util.TreeSet();
		ss.add("MK");		
		ss.add("LK");		
		ss.add("IK");		
		ss.add("SK");		
		ss.add("PK");		

		System.out.println(ss);

		System.out.println("ss.headSet("+"SK"+")::"+ss.headSet("SK"));
		System.out.println("ss.tailSet("+"SK"+")::"+ss.tailSet("SK"));
		System.out.println(ss.subSet("IK","PK"));
		System.out.println(ss.first());
		System.out.println(ss.last());
	}
}
