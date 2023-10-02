class Demo{
	public static void main(String[] args){
		int[][][]  arr= {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,16},{17,18,19}}};
		for(int[][] x:arr){
			for(int[]y :x){
				for(int z: y){
					System.out.print(z+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
