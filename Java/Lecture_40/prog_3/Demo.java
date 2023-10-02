class Demo{
	public static void main(String[] args) throws java.io.IOException{
		int[][] arr = new int[3][];

		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		
		for(int i =0;i<arr.length;++i){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = Integer.parseInt((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
			}
		}


		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int[] x: arr){
			for(int y:x){
				y = Integer.parseInt((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
			}
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
