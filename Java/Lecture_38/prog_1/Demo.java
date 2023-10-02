class Demo{
	void fun(int[] arr){
		arr[1] =70;
		arr[2] =80;
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
	}
	public static void main(String[] args){
		int[] arr = {10,20,30,40};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		
		Demo obj = new Demo();

		
		for(int x:arr){
			System.out.println(x);
		}
		obj.fun(arr);
		int x=10;
		int y=40;
		
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[3]));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
