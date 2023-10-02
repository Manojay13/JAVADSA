class Demo{
	static int findFactor(int num){
		int count =0;
		Integer itr =0;
		for(int i =1;i*i<num+1;i++){
			itr++;
			if(num%i==0){
				if(i==num/i)
					count=count+1;
				else 
					count=count+2;
			}
		}
		System.out.println(itr);
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
