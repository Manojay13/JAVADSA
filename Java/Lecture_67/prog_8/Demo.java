interface Demo{
	static void fun(){
		System.out.println("n demo fun");
	}
}

class DemoChild implements Demo{}

class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
		obj.fun();
	}
}

