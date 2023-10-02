class Parent{
	static int x = 10;
	static{
		System.out.println("In Parent static block");
	}
	static void access(){
		System.out.println("In Parent static method");
		System.out.println(x);
	}
}
class Child extends Parent{
	static{
		System.out.println("In child static block");
		access();
	}

}

class Client{
	public static void main(String[] args){
		Child cObj = new Child();
	}
}
