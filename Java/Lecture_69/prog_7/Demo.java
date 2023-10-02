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



class Demo{
	static int x =10;
	public static void main(String[] args){
		System.out.println(x);
	}
}
