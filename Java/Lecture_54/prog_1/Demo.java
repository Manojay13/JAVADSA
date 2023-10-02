class Demo{
	private int x = 10;
	private static int y =20;

	private void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		//System.out.println(x);//error
		System.out.println(y);
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new Demo();

		obj.fun1();
		obj.fun2();

		//fun1();//cannot find symbol
		
		Demo.fun2();
		//Demo.fun1();
	}
}
