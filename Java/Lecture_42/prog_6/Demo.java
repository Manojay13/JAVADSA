class Demo{
	public static void main(String[] args){
		String str1 = "MK";
		String str2 = "MK";
		String str3 = new String("MK");
		String str4 = new String("MK");
		String str5 = new String("SK");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));

	}
}
