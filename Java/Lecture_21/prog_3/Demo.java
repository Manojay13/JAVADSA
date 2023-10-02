class Demo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the character::");
		String str = sc.next();
		System.out.print("Enter the row number::");
		int rowNum = sc.nextInt();
		System.out.print("Enter the column  number::");
		int colNum = sc.nextInt();

		for(int i =0;i<rowNum;i++){
			for(int j =0;j<colNum;j++){
				System.out.print(str+" ");
			}
			System.out.println();
		}
	}
}
