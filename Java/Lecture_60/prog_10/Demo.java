class Parent{
	static{
		System.out.println("In Parent Static block");	
	}
	static void access(){	
		System.out.println("In Static Parent method");	
	}
}


class Child extends Parent{
	static{
		access();
	}
}

class Client{
	public static void main(String[] args){
	 Child cObj = new Child();
	}
}
