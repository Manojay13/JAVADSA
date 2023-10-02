class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.FileWriter fw = new java.io.FileWriter("Incubator.txt",true);
		fw.write("Flutter1\n");
		fw.write("Backend\n");
		fw.write("Frontend\n");

		fw.close();
	}
}
