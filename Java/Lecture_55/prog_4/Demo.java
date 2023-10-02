class Demo{
	int x =10;//instance variable
	void fun(){
		int y =20;//method local variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	int z =30;

	void gun(){
		fun();	
	}

	public static void main(String[] args){
		new Demo().gun();
	}
}
