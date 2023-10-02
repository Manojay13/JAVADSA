class Demo{
	public static void main(String[] args){
		for(int i=0;i<3;i++){
			int num =0;
			char ch='A';
			for(int j =0;j<4;j++){
				if(j%2==0)
					System.out.print((ch++)+" ");
				else
					System.out.print(++num+" ");
			}
			System.out.println();
		}
	}
}
