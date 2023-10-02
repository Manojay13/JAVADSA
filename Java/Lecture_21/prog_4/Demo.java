class Demo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int rowNum = sc.nextInt();
		int colNum = sc.nextInt();

		for(int i= 0;i<rowNum;i++){
			for(int j =0;j<colNum;j++){
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
}
