class IntegerCache{
	public static void main(String[] args){
		int x = 10;
		int y = 20;//identity hashcode of both will be different
		Integer z = 10;
		int l =129;
		int m  =129;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(l));
		System.out.println(System.identityHashCode(m));

	}
}
