class Parent{
	void fun(){
		System.out.println("In Parent");
	}
}

class Child extends Parent{
	public void fun(){
		System.out.println("In Child");
	}
}

class Client{
	public static void main(String[] argss){
		Parent pObj = new Child();
		pObj.fun();
	}
}


