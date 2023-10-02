class InputDemo{
	public static void main(String[] args) throws java.io.IOException{
       		java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
		char ch =(char)isr.read();
		System.out.println(ch);
	}
}
