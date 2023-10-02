/*
* * * 
* * * 
* * * 


*/class Demo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int number = sc.nextInt();
		int rowNum;
		int colNum;
		rowNum=colNum=number;
		for(int i =0;i<rowNum;i++){
			for(int j=0;j<colNum;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
