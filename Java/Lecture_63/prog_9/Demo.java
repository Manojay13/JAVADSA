class Demo{
	void fun(Object str){
		System.out.println("In  Object");
	}
	void fun(String str){
		System.out.println("In  String");
	}
}

class Client{
	public static void main(String[] args){
		Demo str = new Demo();
		str.fun(null);
		str.fun(new StringBuffer("One"));
		str.fun("One");
	}
}
