class Demo{
	public static void main(String[] args){
		java.util.HashMap hm = new java.util.HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");

		System.out.println(hm);

		System.out.println(hm.get("Python"));

		//  public abstract java.util.Set<K> keySet();
		System.out.println(hm.keySet());

		//public abstract java.util.Collection<V> values();
		System.out.println(hm.values());
		//public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
		System.out.println(hm.entrySet());

	}
}
