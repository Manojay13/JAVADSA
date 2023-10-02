class Demo{
	public static int myStringLength(String str){
		char[] arr = str.toCharArray();
		int count =0;
		for(int x:arr)
			count++;
		return count;

	}
	public static void main(String[] args) throws java.io.IOException{
		System.out.print("Enter the String 1::");
		String str1 = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();
		System.out.print("Enter the String 2::");
		String str2 = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();

		if(myStringLength(str1)==myStringLength(str2))
				System.out.println("Both strings are equal in length");
		else
				System.out.println("Strings are not equal in length");
	}
}
