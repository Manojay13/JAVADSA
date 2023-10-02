class Demo{
	void fun(int[] arr){
		arr[1] =70;
		arr[2] =80;
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
	}
	public static void main(String[] args){
		int[] arr = {10,20,30,40};
		/*System.out.println(System.identityHashCode(arr[i0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));*/
		
		Demo obj = new Demo();

		
		for(int x:arr){
			System.out.println(x);
		}
		obj.fun(arr);
		int x=10;
		int y=40;
		System.out.println("In main");	
		System.out.println(System.identityHashCode("arr1="+arr[1]));
		System.out.println(System.identityHashCode("arr2="+arr[2]));
		System.out.println(System.identityHashCode("x"+x));
		System.out.println(System.identityHashCode("y="+y));
	}
}
