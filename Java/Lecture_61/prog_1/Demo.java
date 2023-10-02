class Parent{
	int x = 10;
	static int y = 20;
	Parent(){
		System.out.println("Parent Constructor");
	}

	void fun(){
		System.out.println("In Parent instance method");
	}

	static void run(){
		System.out.println("In Parent static method");
	}
}

class Child extends Parent{
	void gun(){
		System.out.println("In child instance method");
	}	
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Parent();//
		Child cObj = new Child();
		System.out.println(cObj.x);
		System.out.println(cObj.y);
		cObj.fun();
		cObj.run();
		cObj.gun();
	}
}
