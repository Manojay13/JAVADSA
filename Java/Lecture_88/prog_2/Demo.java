class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add("MK");
		al.add("SK");
		al.add("LK");
		al.add("PK");
		al.add("IK");
		al.add("IK");

		System.out.println("ArrayList=="+al);//[MK,SK,LK,PK,IK]

		java.util.TreeSet ts = new java.util.TreeSet(al);
		System.out.println("TreeSet=="+ts);

		java.util.Collections.sort(al);
		System.out.println("Collections=="+al);
	}
}
