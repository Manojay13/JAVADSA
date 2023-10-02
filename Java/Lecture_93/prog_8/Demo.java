interface Core2Web{ 
	 String lang(String name1,String name2);
}

class Year2022 {
	public static void main(String[] args){
		Core2Web c2w = (name1,name2)->{
		       	return (name1+" & "+name2 +"By MK");
		};
		System.out.println(c2w.lang("website","Win32Git"));
	}
}
