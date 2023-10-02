class Demo{
	public static void main(String[] args){
		System.out.println(new StringBuffer());
		System.out.println(new StringBuffer().capacity());//16
		System.out.println(new StringBuffer("MK").capacity());//18
		System.out.println(new StringBuffer("Shashi").capacity());//22
		System.out.println(new StringBuffer().append("Manojay").capacity());//16
		System.out.println(new StringBuffer().append("ManojayKulkarni13").capacity());//16*2+2=34

	}
}
