class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj = new java.io.File("Incubtor.txt");
		java.io.FileWriter fw = new java.io.FileWriter("Incubator.txt");
		fw.write("Flutter\n");
		fw.write("Backend\n");
		fw.write("Frontend\n");

		fw.close();
	}
}
