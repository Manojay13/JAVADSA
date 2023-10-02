class Demo{
	int x =10;
	Demo(){
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(this);
	}
	void fun(){
		System.out.println("In ");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(this);
	}

	public static void main(String[] args){

		Demo obj1 = new Demo();
		obj1.x = 20;
		obj1.fun();
		//Demo obj2 = new Demo();
		//Boolean[] b= new Boolean[2];

		//System.out.println(b[0]);
	}
}
