class Parent{
	static {
		System.out.println("In Parent Static block");
	}
}
class Child extends Parent{
	static {
		System.out.println("In Child Static block");
	}
}

class Demo{
	public static void main(String[] args){
		Child cObj = new Child();
	}
}
