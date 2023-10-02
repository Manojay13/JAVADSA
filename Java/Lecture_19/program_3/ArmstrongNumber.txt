class ArmstrongNumber{
	public static void main(String[] args){
		int number = 153;

		int temp1 =number;
		int temp2 = number;
		int count =0;
		int sum =0;
		while(temp1>0){
			count++;
			temp1=temp1/10;
		}
		while(number>0){
			int rem = number %10;
			int mult=1;
			//int sum =0;
			
			for(int i =1;i<count+1;i++){
					mult = mult*rem;
			}
			sum=sum+mult;
			number = number/10;
		}
		
		
		
		if(temp2==sum){
			System.out.println(temp2+" is Armstrong number");
		}
		else
			System.out.println(temp2+" is not Armstrong number");

		
	}
}
