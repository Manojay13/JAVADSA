class Demo{
	public static void main(String[] args){
		//int[] arr = {10,20,30,40};
		int[][] arr={{10,20,30},{40,50,60}};

		for(int i=0;i<arr.length;++i){
			for(int j=0;j<arr[i].length;++j){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


		System.out.println("\nJagged Array");
		int[][] arr1={{10,20,30},{40,50},{60}};

		for(int i=0;i<arr1.length;++i){
			for(int j=0;j<arr1[i].length;++j){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
/*			System.out.println(arr1[1][2]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at Demo.main(Demo.java:23)*/

	}
}
