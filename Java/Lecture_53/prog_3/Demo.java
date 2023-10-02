class Demo{
	static int x = 10;
	static int y = 20;
	static int z ;

	static void display(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}


class Client{
	public static void main(String[] args){
		System.out.println(Demo.x);
		System.out.println(Demo.y);

		Demo.display();
	}
}
/*
 *class Demo{
 	static int x;
	static int y ;

	Demo(){
		super();
	}

	static {
		x=10;
		y=20;
	}
 }
 * */
