class DigitNum{
	public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int number = sc.nextInt();


	while(number>0){
		System.out.println(number%10);
		number/=10;
		}
	}
}
