class Demo{
	int x = 20;
	Demo(){
		System.out.println("In Demo constructor");
	}
	int y = 20;
	public static void main(String[] args){
		System.out.println(new Demo().x);	
		System.out.println(new Demo().y);	
	}

}
