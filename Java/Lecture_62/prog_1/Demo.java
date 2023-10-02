class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	void marry(){
		System.out.println("Deepika");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child constructor");
	}
	void marry(){
		System.out.println("Alia");
	}

}
class Client{
	public static void main(String[] args){
	Child cObj = new Child();
	cObj.marry(); 
	}
}
