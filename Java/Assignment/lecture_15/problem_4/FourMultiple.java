class FourMultiple{
	public static void main(String[] args){
		System.out.println("Enter the number::");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int number= sc.nextInt();

		int i =4;

		while(i<number+1){
			System.out.println(i);
			i = i+4;
		}
	}
}
