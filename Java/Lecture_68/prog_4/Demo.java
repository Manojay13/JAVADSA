interface Demo1{
	default void gun(){
		System.out.println("In gun demo");
	}
}
class DemoChild implements Demo1{
	public void gun(){
		System.out.println("In gun-demoChild");
	}
}

class Client{
	public static void main(String[] args){
		Demo1 obj = new DemoChild();
		obj.gun();
	}
}
