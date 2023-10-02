class ContinueDemo{
	public static void main(String[] args){
		int Num =10;
		for(int i =1;i<Num+1;i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
	}
}
