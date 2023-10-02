interface Demo{
	static void fun(){
		System.out.println("public-static");
	}
	default void gun(){
		System.out.println("public-default");
	}
}

class DemoChild implements Demo{
	void fun(){
		System.out.println("In Demochild");
	}	
}

class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}

