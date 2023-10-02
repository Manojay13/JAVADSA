class Demo{
	public static void main(String[] args){
		int x = 200;
		int y =200;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		
		Integer z = 200;
		Integer t =200;

		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(t));
	}
}
