class Factors{
	public static void main(String[] args){
		int number = 16;
		for(int i=1;i<number+1;i++){
			if(number%i==0){
				System.out.println(i);
			}
		}
	}
}
