class LessThan10{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Enter the number::");
		int number = Integer.parseInt(br.readLine());

		if(number==10)
			System.out.println("???");
		else if(number>10)
			System.out.println(number+" is greater than 10");
		else if(number<10)
			System.out.println(number+" is less than 10");
	}
}
