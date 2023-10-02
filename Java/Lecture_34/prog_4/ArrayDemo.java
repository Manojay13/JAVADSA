class ArrayDemo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		int arr[]= new int[5];
		for(int i =0;i<arr.length;i++){
			System.out.print("Enter the numbe at index arr["+i+"]::");
			arr[i]= Integer.parseInt(br.readLine());
		}
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
