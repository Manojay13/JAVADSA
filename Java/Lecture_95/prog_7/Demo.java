class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.FileInputStream fis = new java.io.FileInputStream("Incubator.txt");

		java.io.FileDescriptor fd = fis.getFD();

		java.io.FileReader fr = new java.io.FileReader(fd);

		int data = fr.read();
	}
}
