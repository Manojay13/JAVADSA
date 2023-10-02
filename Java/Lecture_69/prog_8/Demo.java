class Outer{
	void m1(){
	
			System.out.println("In m1-outer");
	}
	static class Inner{//Static inner class
		void m1(){
			System.out.println("In m1-static Inner");
		}	
	}

	public static void main(String[] args){
		Inner obj = new Inner();
		obj.m1();
		new Outer().m1();
		
	}


}

class Client{
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.m1();
		new Outer().m1();
		
	}
}



