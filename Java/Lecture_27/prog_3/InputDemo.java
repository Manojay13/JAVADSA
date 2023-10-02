class InputDemo{
	public static void main(String[] args) throws java.io.IOException{
       		java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
		char ch =(char)isr.read();
		System.out.println(ch);
		isr.close();
		System.out.println("Enter the character");	
		char ch1 =(char)isr.read();
		System.out.println("Enter the character");	
		char ch2 =(char)isr.read();
	}
}
