class Demo{
	public static void main(String[] args){
		char ch ='A';
		int num =65;

		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(num));
	}
}
