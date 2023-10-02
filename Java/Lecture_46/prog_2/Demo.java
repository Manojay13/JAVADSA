class Demo{
	public static void main(String[] args){
		String str1 ="Manojay";
		String str2 ="Kulkarni";
		StringBuffer str3 = new StringBuffer("Core2Web");

	//	String str4 = str1.concat(str3);
		str1.concat(str2);
		str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
