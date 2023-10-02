class FactorsCount{
	public static void main(String[] args){
		int number = 2;

		int count =0;
		for(int i=1;i<number+1;i++){
			if(number%i==0){
				count++;
			}
		}
		System.out.println("Count=="+count);
		if(count==2){
			System.out.println(number+" is prime number");
		}
		else 
			System.out.println(number+" is not prime number");
	}
}
