class Parent{
	public void fun(){
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.fun();
	}
}
