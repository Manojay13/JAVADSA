class Parent{
	Parent(){
		System.out.println("In parent Constructor");
	}
}
class Child extends Parent{
	Child(){
//		this();//error: recursive constructor invocation
//	Child(){
//	^

		System.out.println("In child Constructor");
	}
}


class Client{
	public static void main(String[] args){
		Child cObj = new Child();

	}
}
