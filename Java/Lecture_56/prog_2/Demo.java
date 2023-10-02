class Demo{
	Demo(){
		System.out.println("No argument constructor");
	}
	Demo(int x){
		System.out.println("In parameterised constructor");
	}
	Demo(Demo obj){
		System.out.println("In parameterised Demo Constructor");
	}

	public static void main(String[] args){
		Demo obj1 =new Demo();
		Demo obj2 =new Demo(10);
		Demo obj3 =new Demo(obj2);
	}
}
