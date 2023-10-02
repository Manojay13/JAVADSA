class AllDataTypesErrFree{ 
	int x =20;//instace variable or global variable -->Heap inside object
	int y;
	static int z;
	void fun(){
	
	}
	public static void main(String[] args){
		int x =10;//in stack
		System.out.println(new AllDataTypesErrFree().x);
		//System.out.println(y);
		/*AllDataTypesErrFree.java:7: error: non-static variable y cannot be referenced from a static context
		System.out.println(y);
		                   ^
1 error*/
		System.out.println(new AllDataTypesErrFree().y);
		System.out.println(z);//allowed
		System.out.println(new AllDataTypesErrFree().z);//allowed but lengthy
		fun();
		System.out.println(x);
			
	}
}
