class Demo{
	public static void main(String[] args){
		int arr[][] = new int[2][2];
		System.out.println(arr[1][1]);
		System.out.println(arr[1]);
		System.out.println(arr);
		System.out.println(System.identityHashCode(arr[0][0]));
		System.out.println(System.identityHashCode(arr[0][1]));
		System.out.println(System.identityHashCode(arr[1][0]));
		System.out.println(System.identityHashCode(arr[1][1]));
	}
}
