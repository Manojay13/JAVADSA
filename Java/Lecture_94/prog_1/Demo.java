class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.File fObj = new java.io.File("MK.txt");//here file is not created as it is not his job . it has another method to do this
		System.out.println(fObj.exists());
		fObj.createNewFile();
		System.out.println(fObj.exists());

	}
}
