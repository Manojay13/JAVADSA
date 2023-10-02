class Demo{
	public static void main(String[] args){
		int number =4;
		for(int i =1;i<=number;i++){
			for(int j=1;j<=number;j++){
				if(j==1 ||j==number)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
 *j%number==1 || j%number==0
 *
 * */
