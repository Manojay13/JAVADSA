class Demo{
	int x =10;
	private int y ;

	void display(){
		System.out.println(x);
		System.out.println(y);
	}


}

class Client{

	public static void main(String[] args){
		 
		System.out.println(new Demo().x);
		System.out.println(new Demo().y);

		new Demo().display();
	}
}
