abstract class Parent{
	void Career(){
		System.out.println("Doctor");
	}

	abstract void marry();
}

class Child extends Parent{
	void marry(){
		System.out.println("Disha");
	}
}

class Client{
	public static void main(String[] args){
		Parent pObj = new Child();
		pObj.Career();
		pObj.marry();
	}
}
