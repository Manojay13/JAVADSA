class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.util.Properties obj = new java.util.Properties();

		java.io.FileInputStream fObj = new java.io.FileInputStream("Friends.properties");
		obj.load(fObj);
		String name = obj.getProperty("MK");
		System.out.println(name);

		obj.setProperty("PK","Airbnb");
		java.io.FileOutputStream outObj = new java.io.FileOutputStream("Friends.properties");
		obj.store(outObj,"Updated by Manojay");
	}
}
