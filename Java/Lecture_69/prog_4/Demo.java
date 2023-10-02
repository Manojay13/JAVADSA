class Outer{
	class Inner{
		void m1(){
			System.out.println("In inner m1");
		}
	}
		void m2(){
			System.out.println("In Outer m2");
		}
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m2();
		new Outer().new Inner().m1();

		//new Inner().m1();//error
		Inner obj1 = new Outer().new Inner();
		obj1.m1();
	}
}

class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m2();
		new Outer().new Inner().m1();
		Outer.Inner obj2 = new Outer().new Inner();
		obj2.m1();
	}
}
