class Parent{
	void fun(){
		System.out.println("Parent fun");
	}
}

class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
	void gun(){
	
	}
}

class Client{
	public static void main(String[] args){
		Parent p = new Parent();
		p.fun();
		//p.gun();//error

		Child cObj = new Child();
		cObj.fun();
		cObj.gun();

		Parent pObj = new Child();	
		pObj.fun();
	}
}
