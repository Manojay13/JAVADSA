class Demo{
	public static void main(String[] args) throws java.io.IOException{
			java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			System.out.print("Enter size of array::");
			int size = Integer.parseInt(br.readLine());

			int[] arr = new int[size];

			System.out.println(arr.length);
			int sum =0;
			/*for(int i =0;i<arr.length;++i){
				System.out.print("Enter the "+i+"th element::");
				arr[i] = Integer.parseInt(br.readLine());
				sum = sum +arr[i];

			}

			System.out.println("Addition of all elemts of array"+sum);*/
			int count =0;
			for(int i =0;i<arr.length;++i){
				System.out.print("Enter the "+i+"th element::");
				arr[i] = Integer.parseInt(br.readLine());
				if(arr[i]%2 ==0)
					count++;

			}
			System.out.println("Even count of all elements of array is ::"+count);
				
	}
}
