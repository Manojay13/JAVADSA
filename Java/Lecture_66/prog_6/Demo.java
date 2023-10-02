interface  Demo1{
	static void m1(){
		System.out.println("In static m1 Demo1");
	}
}
interface  Demo2{
	static void m1(){
		System.out.println("In static m1 Demo2");
	}
}
interface  Demo3 extends Demo1,Demo2{
}

class Demo22 implements Demo3{
	public static void main(String[] args){
		Demo1 obj1 = new Demo22();
		Demo2 obj2 = new Demo22();
		Demo3 obj3 = new Demo22();

		Demo1.m1();
		//obj2.m1();
		//obj3.m1();
	}
}
