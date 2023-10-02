class OddNumber{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int number = sc.nextInt();
		int i=0;
		while(i<number+1){
			if(i%2!=0)
				System.out.println(i);
			i++;
		}
	}
}
