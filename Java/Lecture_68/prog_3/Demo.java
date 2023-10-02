interface Demo1{
	static void fun(){
		System.out.println("public-static");
	}
	default void gun(){
		System.out.println("public-default");
	}
}
interface Demo2{
	static void fun(){
		System.out.println("public-static");
	}
	default void gun(){
		System.out.println("public-default");
	}
}

class DemoChild implements Demo1,Demo2{
	void fun(){
		System.out.println("In Demochild");
	}	
}

class Client{
	public static void main(String[] args){
		Demo obj = new DemoChild();
		//obj.fun();
		//obj.gun();
		Demo.fun();
	}
}

