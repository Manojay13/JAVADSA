class AutoBoxing{
	public static void main(String[] args){
		int x =10;
		int y =20;
		Integer z =10;
		Integer w = new Integer(10);
		System.out.println("x="+System.identityHashCode(x));
		System.out.println("y="+System.identityHashCode(y));
		System.out.println("z="+System.identityHashCode(z));
		System.out.println("w="+System.identityHashCode(w));
	}
}
