import java.util.Scanner;
class Max{
	public static void main(String[] args){
		System.out.print("Enter number A::");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter number B::");
		int b = sc.nextInt();

		if(a>b)
			System.out.println(a+" is greater than "+b);
		else if(a<b) 
			System.out.println(b+" is greater than "+a);
		else 
			System.out.println(a+" is equal to "+b);
	}
}
