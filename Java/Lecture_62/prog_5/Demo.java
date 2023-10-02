class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void fun(int y){
	
		System.out.println("In Parent fun");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
	void fun(int x){
		System.out.println("In Child fun");
	
	}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.fun(10);
	}
}
