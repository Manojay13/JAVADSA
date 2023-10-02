class Demo{
	public static void main(String[] args){
		String[] arr = {"MK","MK"};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(args[0]));
		System.out.println(System.identityHashCode(args[1]));
	}
}
