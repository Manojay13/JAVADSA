class Demo{
	void fun(int x,float f){
		System.out.println("In int-float para");
	}

	void fun(float f ,int x){
		System.out.println("In float-int para");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new Demo();
		//obj.fun(10.5f,10);
		obj.fun(10,10);
	}
}
