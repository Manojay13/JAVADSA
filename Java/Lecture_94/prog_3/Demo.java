class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj = new java.io.File("FileHandling1","one");
		fObj.mkdir();
		fObj = new java.io.File("FileHandling1","one.txt");
		fObj.mkdir();
		fObj = new java.io.File("FileHandling1","two.txt");

		fObj.createNewFile();
		//fObj = new java.io.File("FileHandling2","two.txt");
		//fObj.createNewFile();
		fObj = new java.io.File("FileHandling3","one.txt");
		fObj.mkdir();
	}
}
