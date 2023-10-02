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

		//subMap
		System.out.println(tm.subMap("Aus","Pak"));

		//headMap
		System.out.println(tm.headMap("Pak"));
		
		//tailMap
		System.out.println(tm.tailMap("Pak"));
		
		//firstKey
		System.out.println(tm.firstKey());
		
		//lastKey
		System.out.println(tm.lastKey());
		
		//keySet
		System.out.println(tm.keySet());
		
		//values
		System.out.println(tm.values());
		
		//entrySet
		System.out.println(tm.entrySet());
	}
}
