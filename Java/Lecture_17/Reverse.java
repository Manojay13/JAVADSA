/*
 * Sum of alldigits of given integer
 *Input :6531
 *Output :1365
 * */

class Reverse{
	public static void main(String[] args){
		int number =6531;
		int rev =0;

		while(number>0){
			rev =rev*10 + (number%10);
			number = number/10;

		}

		System.out.println("Reverse of  digits for given number is:"+rev);
	}
}
