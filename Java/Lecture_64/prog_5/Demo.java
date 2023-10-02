class Parent{
	static void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("In child fun");
	}
}


class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.fun();
		Child cObj = new Child();
		cObj.fun();
	}
}
