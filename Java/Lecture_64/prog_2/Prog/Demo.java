class Parent{
	void fun(){
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	private void fun(){
		System.out.println("Child fun");
	}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.fun();
	}
}
