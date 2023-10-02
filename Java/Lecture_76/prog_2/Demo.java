class Demo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		try{
			int x = sc.nextInt();
		}catch(ArithmeticException | NullPointerException obj){
		}
	}
}
