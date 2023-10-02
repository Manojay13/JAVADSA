class PerfectNumber{
	public static void main(String[] args){
		int number = 6;

		int sum =0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum = sum +i;
			}
		}
		
		if(sum==number){
			System.out.println(number+" is strong number");
		}
		else
			System.out.println(number+" is not strong number");

		
	}
}
