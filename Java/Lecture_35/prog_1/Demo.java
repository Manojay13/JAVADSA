class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int[] arr = new int[5];
		//Naive Approach
		/*for(int i =0;i<arr.length;i++){
			System.out.print("Enter number at index "+i+"::");
			arr[i]= Integer.parseInt(br.readLine());
		}

		int sum =0;
		sum =arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println("Sum of all input of array is::"+sum);*/
		/*for(int i =0;i<arr.length;i++){
			System.out.print("Enter number at index "+i+"::");
			arr[i]= Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i =0;i<arr.length;i++){
			sum =sum+arr[i];
		}

		System.out.println("Sum of all input of array is::"+sum);*/
		int sum =0;
		for(int i =0;i<arr.length;i++){
			System.out.print("Enter number at index "+i+"::");
			arr[i]= Integer.parseInt(br.readLine());
			sum = sum +arr[i];
		}

		System.out.println("Sum of all input of array is::"+sum);


	}
}
