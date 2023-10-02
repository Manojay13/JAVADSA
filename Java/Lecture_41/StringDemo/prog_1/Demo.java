class Demo{
	public static void main(String[] args){
		String str ="MK";
		String str1 =new String("MK");
		char[] str2 = {'M','K'};
		String str3 ="MK";
		
		

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
