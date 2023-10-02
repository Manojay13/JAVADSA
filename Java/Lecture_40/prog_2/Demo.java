class Demo{
	public static void main(String[] args){
		int[][] arr ={{10,20,30},{40,50},{60}};
		for(int[] x: arr){
			for(int y:x)
				System.out.print(y+" ");
			System.out.println();
		}
		int[][] arr2 =new int[3][];

		arr2[0]=new int[]{1,2,3};
		arr2[1]=new int[]{4,5};
		arr2[2]=new int[]{6};
		for(int[] x: arr2){
			for(int y:x)
				System.out.print(y+" ");
			System.out.println();
		}
		
	}
}
