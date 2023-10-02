interface Demo{
	default void fun(){
		System.out.println("In fun-demo");
	}
}

class DemoChild implements Demo{
	public  void gun(){
		System.out.println("in gun demochild");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new DemoChild();
		obj.fun();
	}
}
