abstract class Parent{
	void Career(){
		System.out.println("Doctor");
	}

	private	abstract void marry();
}

class Child extends Parent{
	void marry(){
		System.out.println("Disha");
	}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
	}
}
