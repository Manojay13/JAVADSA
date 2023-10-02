interface Demo1{
	default void fun(){
		System.out.println("In fun-demo");
	}
}

interface Demo2{
	default void fun(){
		System.out.println("In fun-demo");
	}
}

class DemoChild implements Demo1,Demo2{
}

class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
		obj.fun();
	}
}
