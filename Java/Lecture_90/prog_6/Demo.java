/*  
  public abstract class java.util.Dictionary<K, V> {
  public java.util.Dictionary();
  public abstract int size();
  public abstract boolean isEmpty();
  public abstract java.util.Enumeration<K> keys();
  public abstract java.util.Enumeration<V> elements();
  public abstract V get(java.lang.Object);
  public abstract V put(K, V);
  public abstract V remove(java.lang.Object);
}
*/

class Demo{
	public static void main(String[] args){
		//java.util.Hashtable ht = new java.util.Hashtable();
		java.util.Dictionary ht = new java.util.Hashtable();

		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(18,"Virat");
		ht.put(1,"KLRahul");
		ht.put(45,"Rohit");

		System.out.println(ht);

		//keys
		java.util.Enumeration itr1 = ht.keys();
		
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}
		System.out.println("====Elements====");
		//elements
		java.util.Enumeration itr2 = ht.elements();
		
		while(itr2.hasMoreElements()){
			System.out.println(itr2.nextElement());
		
		}

		System.out.println(ht.get(10));
		ht.remove(1);
		System.out.println(ht);
	}
}
