class Outer{
	int x = 10;
	static int y =20;
	
	class Inner{
		final static int a =30;

	}

}

class Client{
	public static void main(String[] args){
		System.out.println(new Outer().x);
		System.out.println(Outer.y);
//		System.out.println(new Outer().Inner.a);//error: unexpected type
//							System.out.println(new Outer().Inner.a);
//		                   ^
 							// required: class,package
  							//found:    value
							//1 error
		System.out.println(Outer.Inner.a);
		System.out.println(new Outer().new Inner().a);
	}
}
