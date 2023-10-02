class Demo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Manojay");
		System.out.println(System.identityHashCode(sb));
		sb.append("Kulkarni");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
		System.out.println(sb.capacity());//16+7=23
		System.out.println(new StringBuffer().capacity());//16


	}
}
