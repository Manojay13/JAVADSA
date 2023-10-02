class Demo{
	static int x =10;
	int y =30;
	static{
		System.out.println("In static block 1");
		System.out.println(x);
	}
	public static void main(String[] args){
		System.out.println("In main");
	}
	static{
		System.out.println("In static block 2");
		System.out.println(x);
		System.out.println(new Demo().y);
	}

}
