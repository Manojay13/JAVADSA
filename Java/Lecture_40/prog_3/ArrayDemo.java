class ArrayDemo{
	public static void main(String[] args){
		int[] arr =new int[3];

		for(int i =0;i<arr.length;i++){
		arr[i] =(new java.util.Scanner(System.in)).nextInt();
		}
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i =0;i<arr.length;i++){
			arr[i] =(new java.util.Scanner(System.in)).nextInt();
		}
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	
	}
}
