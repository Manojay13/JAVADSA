class Demo{
	int x = 10;
	static int y = 20;
	Demo(){
		System.out.println("In Constructor");
	}

	static{
		System.out.println("In static block 1");
	}
	static{
		System.out.println("In static block 2");
	}
	{
		System.out.println("In instance block 1");
	}
	{
		System.out.println("In instance block 2");
	}

	public static void main(String[] args){
		System.out.println("In main");
		Demo obj = new Demo();

	}
}
