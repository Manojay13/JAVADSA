interface Demo{
	int x =10;
	void fun();
}

class DemoChild implements Demo{
	int y =x;
	public void fun(){
		System.out.println(x);
		System.out.println(x);
		System.out.println(Demo.x);
	}
}
