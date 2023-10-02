class Demo{
	public static void main(String[] args){
		String str1 = "Shashi";
		String str2 = new String("Shashi");

		if(str1.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
