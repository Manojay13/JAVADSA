class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.FileReader fr = new java.io.FileReader("Incubator.txt");
		/*Demo.java:3: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
		java.io.FileReader fr = new java.io.FileReader("Incubator.txt");
		                        ^
1 error*/
		int data = fr.read();//as empty return -1 default datatype is integer

		while(data!=-1){
			System.out.print((char)data);
			data = fr.read();
				
		}

		fr.close();
	}
}
