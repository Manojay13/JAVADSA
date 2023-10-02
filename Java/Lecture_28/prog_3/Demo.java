class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Enter societyName::");
		String societyName= br.readLine();
		System.out.print("Enter wing::");
		char wing= (char)br.read();
		System.out.print("Enter FlatNumber::");
		int flatNumber= Integer.parseInt(br.readLine());
		System.out.print("Society Name::"+societyName);
		System.out.print("wing::"+wing);
		System.out.println("flat Number"+flatNumber);
	}
}
