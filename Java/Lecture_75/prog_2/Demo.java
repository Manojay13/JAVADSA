class Demo{
	public static void main(String[] args) throws java.io.IOException{
	try{
		System.out.println(10/0);
	}catch(java.lang.ArithmeticException e){
		System.out.println("Wrong arithmetic operation");
	}

	}
}
