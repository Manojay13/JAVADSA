class Outer{
	static class Inner{
		void m1(){
			System.out.println("In m1-Inner");
		}	
	}
}

class Client{
	public static void main(String[] args){
		new Outer.Inner().m1(); 
	}
}
