class Demo{
	static{
		System.out.println("In static block-1");
	}

	public static void main(String[]  args){
		System.out.println("In main");
	}
}

class Client{
	static{
		System.out.println("In static block-2");
	}

	public static void main(String[]  args){
		System.out.println("In main method");
		System.out.println(String instanceof Serializable);
	}
}
