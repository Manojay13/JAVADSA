class Demo{
	public static void main(String[] args){
		float[] arr= {10,20,30,40,50};//int[] arr =new int[]{10,20,30,40,50};
		System.out.println(arr);
		float[] arr1= {10,20,30,40,50};//int[] arr1 =new int[]{10,20,30,40,50};
		System.out.println(arr1);

		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr1[0]));
	}
}
