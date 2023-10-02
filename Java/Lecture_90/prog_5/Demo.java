/*  
  public abstract java.util.Comparator<? super K> comparator();
  public abstract java.util.SortedMap<K, V> subMap(K, K);
  public abstract java.util.SortedMap<K, V> headMap(K);
  public abstract java.util.SortedMap<K, V> tailMap(K);
  public abstract K firstKey();
  public abstract K lastKey();
  public abstract java.util.Set<K> keySet();
  public abstract java.util.Collection<V> values();
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
*/

class Demo{
	public static void main(String[] args){
		java.util.SortedMap tm = new java.util.TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("SL","SriLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");

		System.out.println(tm);
		
		java.util.Set<java.util.Map.Entry> data = tm.entrySet();
		System.out.println(data);

		java.util.Iterator<java.util.Map.Entry> itr = data.iterator();

		while(itr.hasNext()){

			//System.out.println(itr.next());
			java.util.Map.Entry abc = itr.next();

			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}
