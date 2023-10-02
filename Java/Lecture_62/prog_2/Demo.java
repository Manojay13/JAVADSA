class Parent{
	Parent(){
		System.out.println("In Parent constructor");
	}

	void fun(){
		System.out.println("In fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Parent constructor");
	}

	void gun(){
		System.out.println("In gun");
	}

}
class Client{
	public static void main(String[] args){
		Child cObj = new Child();
		cObj.fun();
		cObj.gun();

		Parent pObj = new Parent();
		pObj.fun();
		//ipObj.gun();

		Parent pObj1 = new Child();
		pObj1.fun();
		pObj1.gun();
	}
}
