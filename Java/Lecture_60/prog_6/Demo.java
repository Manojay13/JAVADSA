class Parent{
	static{	
		System.out.println("In parent static block");
	}
}

class Child{
	static{
	
		System.out.println("In child static block");
	}
}

class Demo{
	public static void main(String[] args){
		//Child cObj = new Child();	
		Parent pObj = new Parent();
	}
}
