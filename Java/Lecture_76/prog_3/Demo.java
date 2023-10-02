class Demo{
	static void fun(int x){
		System.out.println(x);
		fun(++x);
		
	}
	public static void main(String[] args){
		try{
			fun(1);
		}catch(StackOverflowError e){
			System.out.println("Stackoverflow  "+Thread.currentThread().getName());
			e.printStackTrace();
			System.out.println();
		}
	}
}
