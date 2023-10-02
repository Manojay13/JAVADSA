class Demo{
	void fun(Object str){
		System.out.println("In  String");
	}
	void fun(StringBuffer str){
		System.out.println("In  StringBuffer");
	}
}

class Client{
	public static void main(String[] args){
		Demo str = new Demo();
		str.fun(null);
	}
}
