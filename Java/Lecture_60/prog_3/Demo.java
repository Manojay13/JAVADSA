class Parent{
	int x = 10;
	Parent(){
		System.out.println("In parent Constructor");
	}
	void access(){
		System.out.println("In Parent Instance method");
	}
}
class Child extends Parent{
	int y = 20;
	Child(){
		System.out.println("In child Constructor");
		System.out.println(x);
		System.out.println(y);
	}
}


class Client{
	public static void main(String[] args){
		Child cObj = new Child();

	}
}
