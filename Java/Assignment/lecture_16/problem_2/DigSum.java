/*
 * Sum of alldigits of given integer
 *Input :6531
 *Output :15
 * */

class DigSum{
	public static void main(String[] args){
		int number =6531;
		int sum =0;

		while(number>0){
			sum =sum + number%10;
			number = number/10;

		}

		System.out.println("Addition of unit digits for given number is:"+sum);
	}
}
