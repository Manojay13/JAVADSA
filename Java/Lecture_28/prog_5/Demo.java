class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Enter societyName::");
		String societyName= br.readLine();
		System.out.print("Enter wing::");
		char wing= (char)br.read();
		br.skip(1);
		System.out.print("Enter FlatNumber::");
		int flatNumber= Integer.parseInt(br.readLine());
		System.out.println("Society Name::"+societyName);
		System.out.println("wing::"+wing);
		System.out.println("flat Number"+flatNumber);
		br.close();
		java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br1=new java.io.BufferedReader(isr);
		String str = br1.readLine();
	}
}
