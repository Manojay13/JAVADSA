class Outer{
	class Inner{
		void fun(){
			System.out.println(this);
			System.out.println(Outer.this);
		}	
	}
}

class Client{
	public static void main(String[] args){
		Outer oObj= new Outer();
		Outer.Inner iObj = new Outer().new Inner();
		iObj.fun();
		//System.out.println(oObj.this);
	}
}
