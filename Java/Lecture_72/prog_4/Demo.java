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
		System.out.println( Outer.Inner.a);
	}
}
