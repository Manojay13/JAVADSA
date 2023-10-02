
class Parent{
	int x =10;
	static int y =20;
	Parent(){
		System.out.println("In parent constructor");
	}
	void fun(){
		System.out.println("In Child  constructor");
	}
}
class Child extends Parent{
	int x =100;
	static int y =200;
	Child(){
		System.out.println("In Child constructor");
		//System.outprintln(super);//error
		//System.outprintln(Parent);//error:cannont find synbol
	}
	void access(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	}
}

class Client{
	public static void main(String[] args){
		Child cObj = new Child();
		cObj.access();
	}
}
