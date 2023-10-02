class FuncProg{
	public static void main(String[] args){
		/*Thread th = new Thread(new Runnable(){
			public void run(){
				System.out.println("Inside another thread");
			}
		});*/

		//Functional way

		Thread th = new Thread(()->System.out.println("In another thread"));

		th.start();
		System.out.println("In main");
	}
}
