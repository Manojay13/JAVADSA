import java.util.Scanner;

class Fizz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%3==0 && number%5==0)
			System.out.println("FizzBizz");
		else if(number%3==0)
			System.out.println("Fizz");
		else if(number%5==0)
			System.out.println("Bizz");
		else
			System.out.println(number +" is not divisible by both");
		

	}
}
