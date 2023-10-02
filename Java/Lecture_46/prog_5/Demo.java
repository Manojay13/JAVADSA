class Demo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Manojay");
		System.out.println(sb.reverse());
		//How to reverse String
		String str = "Manojay";
		sb = new StringBuffer(str);
		str = sb.reverse().toString();
		System.out.println(str);
		System.out.println(str.getClass().getName());
	}
}
