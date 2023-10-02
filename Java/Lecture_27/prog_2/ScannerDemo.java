class ScannerDemo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your Dream Company::");
		String companyName = sc.next();
		System.out.println("My Company::"+companyName);
		System.out.println("Enter your Package::");
		double myPackage = sc.nextDouble();
		System.out.println("Package::"+myPackage);

	}
}
