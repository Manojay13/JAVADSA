interface Demo{
	default void fun(){
		System.out.println("In fun");
	}
}

class DemoChild  implements Demo{
	
}



class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
		obj.fun();
	}
}
