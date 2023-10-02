class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.print("Enter the size of array::");
		int size= Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<arr.length;++i){
			System.out.print("Enter the "+i+"th element of an array::");
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 ==0)
				evenCount++;
			else 
				oddCount++;
		}
		System.out.println("Evencount::"+evenCount+"\nOddCount::"+oddCount);
	}
}
