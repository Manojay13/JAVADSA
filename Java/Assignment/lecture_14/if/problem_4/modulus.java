import java.util.Scanner;

class Modulus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if(number%4 ==0)
			System.out.println(number+" is Divisible by 4");
		else 
			
			System.out.println(number +" is not divisible by 4");
		
	}
}
