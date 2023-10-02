class DemoJava{
	public static void main(String[] args){
		int arr[];//allowd in java
		//int brr[5];//error in Java
		int brr[] = new int[5];
//		int crr[] = new int[];//DemoJava.java:6: error: array dimension missing
//		int crr[] = new int[];
		int crr[] = new int[]{10,20,30,40};//Allowed in java
		arr= new int[5];
		System.out.println(arr[0]);		

		for(int i =0;i<5;i++){
			arr[i]=(i+1)*10;	
		}
		for(int i =0;i<5;i++){
			System.out.println(arr[i]);;	
		}

		int arr1[] ={10,20,30,40,50};
	}
}
