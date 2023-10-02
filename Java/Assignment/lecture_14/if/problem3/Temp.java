import java.util.Scanner;

class Temp{
	public static void main(String[] args){
	System.out.print("Enter the temperature::");
	Scanner sc = new Scanner(System.in);
	double temperature = sc.nextDouble();

	if(temperature>98.6)
		System.out.println("High");
	else if( temperature<98.0)
		System.out.println("Low");
	else 
		System.out.println("Normal");
	}
}
