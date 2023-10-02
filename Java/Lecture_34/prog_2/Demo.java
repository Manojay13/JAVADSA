class Demo{
	public static void main(String[] args){
		int arr[]={10,20,30,40,50};
	        char brr[]={'A','B','C','D'};
		float crr[]={10.5f,22.4f};
		boolean  drr[]={false, true};

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<brr.length;i++){
			System.out.println(brr[i]);
		}
		for(int i=0;i<crr.length;i++){
			System.out.println(crr[i]);
		}
		for(int i=0;i<drr.length;i++){
			System.out.println(drr[i]);
		}

		System.out.println(drr[3]);//No compile time error but runtime exception Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

	}
}
