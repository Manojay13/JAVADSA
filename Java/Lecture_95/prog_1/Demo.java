class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj = new java.io.File("Incubator1");
		fObj.createNewFile();
		System.out.println("File Created");
	}
}
