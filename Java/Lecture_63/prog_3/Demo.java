class Demo{
	void fun(int x){
		System.out.println("In int para");
	}

	void fun(float  ch){
		System.out.println("In Char para");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun('A');
		obj.fun(10.5);
	}
}
