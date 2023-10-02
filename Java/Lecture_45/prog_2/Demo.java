class Demo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println(System.identityHashCode(sb));
		sb.append("Manojay");
		System.out.println(System.identityHashCode(sb));
		sb.append("Kulkarni");
		System.out.println(System.identityHashCode(sb));
		sb.append("130");
		System.out.println(System.identityHashCode(sb));
	}
}
