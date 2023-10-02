class Demo{
	static int findFactor(int num){
		int count =0;
		for(int i =1;i<num+1;i++){
			if(num%i==0)
				count++;

		}
		return count;
	}
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = sc.nextInt();
		int count = findFactor(num);
		System.out.println("Count=="+count);


	}
}
