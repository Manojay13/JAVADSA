class Demo{
	static void fun(){
		for(int i =10;i<20;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args)	{
		
		for(int i =0;i<10 ;i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

		fun();
	}
}
