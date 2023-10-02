class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.FileWriter fObj = new java.io.FileWriter("Incubator.txt");

		fObj.write("Flutter");
		fObj.write("Backend");
		fObj.close();
		fObj.write("frontend");

		fObj.close();
	}
}
