class Demo{
	public static void main(String[] args){
		String str1 ="MK";
		String str2 = new String("MK");
		String str3 ="MK";
		String str4 = new String("MK");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		String str8 ="Shashi";
		String str5 = new String("Shashi");
		String str6 ="Shashi";
		String str7 = new String("Shashi");

		System.out.println(str8.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(str7.hashCode());
	}
}
