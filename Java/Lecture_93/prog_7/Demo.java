interface Core2Web{ 
	 String lang(int courseNo);
}

class Year2022 {
	public static void main(String[] args){
		Core2Web c2w = (xyz)-> ("BootCamp/Java/Python/OS")+":"+xyz;
		System.out.println(c2w.lang(8));
	}
}
