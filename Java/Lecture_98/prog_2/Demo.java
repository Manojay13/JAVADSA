class Demo{
	static int findFactor(int num){
		int count =0;
		Integer itr =0;
		for(int i =1;i<(num/2)+1;i++){
			itr++;
			if(num%i==0)
				count++;

		}
		System.out.println(itr);
		return count+1;
	}
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the numbers");
		int num = sc.nextInt();
		int count = findFactor(num);
		System.out.println("Count=="+count);


	}
}
