class Three5or4Div{
	public static void main(String[]args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int number =sc.nextInt();

		for(int i =1 ;i<number+1;i++){
		
			if((i%3==0&&i%5==0)||(i%4==0))
				continue;
			System.out.println(i);
		}
	}
}
