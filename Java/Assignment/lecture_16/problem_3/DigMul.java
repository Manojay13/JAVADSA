/*
 * Sum of alldigits of given integer
 *Input :6531
 *Output :15
 * */

class DigMul{
	public static void main(String[] args){
		int number =6531;
		int mul =1;

		while(number>1){
			mul =mul * (number%10);
			number = number/10;

		}

		System.out.println("Multiplication of  digits for given number is:"+mul);
	}
}
