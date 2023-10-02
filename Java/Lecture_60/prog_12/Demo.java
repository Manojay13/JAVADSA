class Parent{
	int x =10;
	static int y =20;
	static{
		System.out.println("Parent static block");
	}
	Parent(){
		System.out.println("Parent Constructor");
	}

	void methodOne(){
		System.out.println(x);
		System.out.println(y);
	}
	void methodTwo(){
		System.out.println(y);
	}
}

class Child extends Parent{
	static{
		System.out.println("In child static block");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}


class Client{
	public static void main(String[] args){
		Child cObj = new Child();
		cObj.methodOne();
		cObj.methodTwo();
	}
}
