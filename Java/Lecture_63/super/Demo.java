class Parent{

}

class Child extends Parent{
	void access(){
		System.out.println((Parent)this);
	}
}

class Client{
	public static void main(String[] args){
		Child cObj = new Child();
		cObj.access();
	}	
}
