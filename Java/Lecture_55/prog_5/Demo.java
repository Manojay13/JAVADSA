class Demo{
	int x =10;

	Demo(){
		System.out.println("Constructor");
	}

	{//instance block 1
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args){
		new Demo();
		System.out.println("In main");
	}
	{//instance block 2
		System.out.println("Instance Block 2");
	}
}
