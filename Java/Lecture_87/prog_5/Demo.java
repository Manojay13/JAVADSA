class MyClass implements Comparable{
	String name = null;
	MyClass(String name){
		this.name= name;
	}

	public String toString(){
		return name;
	}

	public int compareTo(MyClass str){
		//return (int)str.compareTo((MyClass)name);
		//return (str.name).compareTo(this.name);
		return 0;
	}
}
class Demo{
	public static void main(String[] args){
		java.util.TreeSet ts = new java.util.TreeSet();
		/*ts.add(30);
		ts.add(10);
		ts.add(40);
		ts.add(20);*/
		/*ts.add(new StringBuffer("SK"));
		ts.add(new StringBuffer("MK"));
		ts.add(new StringBuffer("PK"));
		ts.add(new StringBuffer("LK"));
		Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1294)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at Demo.main(Demo.java:8)

		*/

		ts.add(new MyClass("SK"));
		ts.add(new MyClass("MK"));
		ts.add(new MyClass("PK"));
		ts.add(new MyClass("LK"));
		/*
		 *Exception in thread "main" java.lang.ClassCastException: MyClass cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1294)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at Demo.main(Demo.java:26)
		 *
		 * */
		System.out.println(ts);
	}
}
