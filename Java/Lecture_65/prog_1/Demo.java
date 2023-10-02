abstract class Demo{
	void career(){
		System.out.println("Doctor");
	}

	abstract void marry();
}

class Child extends Demo{
	void marry(){
		System.out.println("Disha");
	}	
}


class Client{
	public static void main(String[] args){
		//Demo dObj = new Demo();
		//dObj.marry();
		Child cObj = new Child();
		cObj.marry();
	}
}
