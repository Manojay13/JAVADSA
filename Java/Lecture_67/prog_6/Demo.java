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
	public void fun(){
		System.out.println("In fun-demochild");
	}
}

class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
		obj.fun();
		Demo1 obj1 = new DemoChild();
		obj1.fun();
		Demo2 obj2 = new DemoChild();
		obj2.fun();
	}
}
