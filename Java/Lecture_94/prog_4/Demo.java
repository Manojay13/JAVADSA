class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj1 = new java.io.File("Filehandling");
		fObj1.mkdir();
		java.io.File fObj2 = new java.io.File(fObj1,"one.txt");
		fObj2.createNewFile();
	}
}
