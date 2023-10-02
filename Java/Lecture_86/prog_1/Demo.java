class Demo{
	public static void main(String[] args){
		java.util.Vector v = new java.util.Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);
		System.out.println(v.capacity());
		v.removeElement(40);//removes first occurence of 40
		v.removeElement(2);
		System.out.println(v);
		
		java.util.ArrayList al = new java.util.ArrayList();
		al.add("MK");
		al.add("SK");
		al.add("PK");
		al.add("LK");
		java.util.Vector v1 = new java.util.Vector(al);
		System.out.println(v1);
	}
}

