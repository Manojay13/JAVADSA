class Demo{
	public static void main(String[] args){
		java.util.HashSet hs = new java.util.HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(new Integer(10));
		hs.add(new Integer(20));
		System.out.println(hs);
		System.out.println("10%16="+10%16+" "+"20%16="+20%16);
	}
}
