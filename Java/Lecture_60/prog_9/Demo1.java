class Demo{
	public static void main(String[] argw){
		Object o = new Object();
		System.out.println(o);

		char str = 'a';
		System.out.println(str);
		Integer o1 = new Integer(10);
		System.out.println(o1);
		Boolean o2 = new Boolean(true);
		System.out.println(o2);
		StringBuffer oStr = new StringBuffer();
		System.out.println(oStr);

		System.out.println(new Demo().getClass().getName());
	}
}
