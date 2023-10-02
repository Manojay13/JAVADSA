class Outer{
	int x = 10;
	static int y =20;
	void m1(){
		int a = 10;
		//static int b =20;//error as written in block i.e.method
		//final static int b =20;//error: modifier static not allowed here

	}

	public static void main(String[] args){
		int p =50;
		//static int q = 60;//cannot write in any block because it will intitialize before main in static block
		//final static int q =30;//error: modifier static not allowed here

	}
}
