class Parent{
	static int x = 10;
}
class Child extends Parent{
	public static void main(String[] args){
		System.out.println(Parent.x);
		System.out.println(x);
	}
}
