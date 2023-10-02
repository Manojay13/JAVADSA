class Threeand5Div{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int number = sc.nextInt();

		for(int i =1;i<number+1;i++){
			System.out.println(i);
			if(i%3==0&&i%5==0)
				break;
		}
	}
}
