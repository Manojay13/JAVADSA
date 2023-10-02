interface Demo{
	int x =10;
	void fun();
}

class Demo1 implements Demo{
	public void fun(){
		System.out.println(x);
	}
}
