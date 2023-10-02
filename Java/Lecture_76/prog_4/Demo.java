class Demo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int x = sc.nextInt();

		try{
			if(x==0){
				throw new ArithmeticException("Divide by zero");
			}
			System.out.println(10/x);
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
