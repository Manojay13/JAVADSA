class IODemo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String str= br.readLine();
		System.out.println(str);
		br.close();
		char ch = (char)isr.read();
		System.out.println(ch);
	}
}
