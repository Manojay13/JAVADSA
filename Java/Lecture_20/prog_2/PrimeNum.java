class PrimeNum{
	public static void main(String[] args){
		int number =15;
		int count =0;
		int counter = 0;

		for(int i=1;i<number+1;i++){
			if(number%i==0){
				count++;
			}
			counter++;
			System.out.println(counter+" In conditional");

			if(count>2){
				//counter++;
				//System.out.println(counter+" In conditional");
				break;
			}
		}
		 if(count==2){
		 	System.out.println(number+" is prime number");
		 }else
			 System.out.println(number+" is not prime number");
	}
}
