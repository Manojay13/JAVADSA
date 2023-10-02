class Demo{
	public static void main(String[] args){
		int temp = 0;
		int j=0;
		for(int i =0;i<3;i++){
			if(temp>0)
				j = temp;

			for(;j<j+3;j++){
				System.out.print((j+1)+" ");	
				
			}
			temp = j;
			System.out.println();
		}
	}
}
