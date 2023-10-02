class Parent{
	static {
		System.out.println("In Parent Static block");
	}
}
class Child extends Parent{
	static {
		System.out.println("In Parent Static block");
	}
}

class Demo{
	public static void main(String[] args){
		Parent pObj = new Parent();
	}
}
