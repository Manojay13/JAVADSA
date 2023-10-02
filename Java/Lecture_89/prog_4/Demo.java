class Demo{
	public static void main(String[] args){
		

		java.util.HashMap hm = new java.util.HashMap();
		hm.put(2,"Google");
		hm.put(7,"Facebook");
		hm.put(3,"Meta");
		hm.put(5,"Apple");

		System.out.println(hm);
		System.out.println("new Integer(2).hashCode() = "+new Integer(2).hashCode());
		System.out.println("new Integer(7).hashCode() = "+new Integer(7).hashCode());
		System.out.println("new Integer(3).hashCode() = "+new Integer(3).hashCode());
		System.out.println("new Integer(5).hashCode() = "+new Integer(5).hashCode());
		
		java.util.HashMap hm1 = new java.util.HashMap();
		hm1.put(112,"Google");
		hm1.put(101,"Facebook");
		hm1.put(133,"Meta");
		hm1.put(150,"Apple");
		/*
		 112 mod 16 = 0
                 101 mod 16 = 5
                 133 mod 16 = 5
                 150 mod 16 = 6
		 * */
		System.out.println(hm1);
		System.out.println("new Integer(112).hashCode() = "+new Integer(112).hashCode());
		System.out.println("new Integer(101).hashCode() = "+new Integer(101).hashCode());
		System.out.println("new Integer(133).hashCode() = "+new Integer(133).hashCode());
		System.out.println("new Integer(150).hashCode() = "+new Integer(150).hashCode());
	}
}
