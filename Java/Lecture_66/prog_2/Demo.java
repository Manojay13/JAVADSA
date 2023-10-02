interface Demo{
	void fun();
	void gun();
}

class Child implements Demo{
	public void fun(){
		System.out.println("In implementedc child fun");
	}
	public void gun(){
		System.out.println("In implementedc child gun");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new Child();
		obj.fun();
		obj.gun();
	}
}
