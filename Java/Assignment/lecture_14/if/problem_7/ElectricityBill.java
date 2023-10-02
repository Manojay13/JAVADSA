class ElectricityBill{
	public static void main(String[] args){
		System.out.println("Please Enter units");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int units = sc.nextInt();

		if(units<=100)
			System.out.println("Your Bill is = "+units);
		else 
			System.out.println("Your Bill is ="+(100 +((units-100)*2)));
	}
}
