interface Demo{
	void fun();
	void gun();
}

abstract class Child implements Demo{
	public void gun(){
		System.out.println("In implementedc child gun");
	}
}

class DemoChild extends Child{
	public void fun(){
		System.out.println("In fun");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}
