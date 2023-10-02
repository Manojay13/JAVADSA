class Demo{
	public static void main(String[] args){
		String str1 ="Manojay";
		String str2 = "Kulkarni";

		System.out.println(str1+str2);

		String str3 = "ManojayKulkarni";
		String str4 = str1.concat(str2);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
