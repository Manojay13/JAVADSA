class Demo{
	public static void main(String[] args){
		String str1 = "Manojay";
		String str2 = new String("Kulkarni");
		StringBuffer str3 = new StringBuffer("Core2Web");

		//String str4 = str1.append(str3);//error
		//String str4 = str3.append(str1);//error: incompatible types: StringBuffer cannot be converted to String
		StringBuffer str4 = str3.append(str1);
		//String str5 =(String) str3.append(str1);//java:10: error: incompatible types: StringBuffer cannot be converted to String
//		String str5 =(String) str3.append(str1);
		                                 


		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
