class Outer{
	int x =20;
	int y =30;
	class Inner{
		void fun2(){
			System.out.println("Fun2-Inner");
			System.out.println(x);
			System.out.println(y);
		}
	}

	void fun1(){
		System.out.println("Fun1-Outer");
	}
}


class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.fun2();
	}
}
