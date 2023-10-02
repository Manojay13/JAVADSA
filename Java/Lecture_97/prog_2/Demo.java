enum ProgrammingLanguage{
	C,CPP,Java,Python
}

class Demo{
	public static void main(String[] args){
		ProgrammingLanguage lang = ProgrammingLanguage.Java;
		System.out.println(lang.ordinal());
		System.out.println(lang.name());
		System.out.println(lang.toString());
	}
}
