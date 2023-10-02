import java.util.Scanner;

class VotingEligible{
	public static void main(String[] args){
		System.out.println("Enter the age::");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age>=18)
			System.out.println("Eligible for vote");
	}
}
