class Outer{
	Object m1(){
		System.out.println("In m1-Outer");

		class Inner{
			void m1(){
				System.out.println("In m1-Inner");
			}
		}
	//Inner obj = new Inner();
	//obj.m1();
	return new Inner();
	}


	void m2(){
		System.out.println("In m2-Outer");
		}
}

class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		//Object obj1= obj.m1();
		//obj1.m1();//error as object doesnt have m1() method
		Object obj1 = new Outer();
		obj1.m1().m1();
			
	}
}
