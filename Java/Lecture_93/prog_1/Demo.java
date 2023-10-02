class Core2Web{ 
	 void lang(){
		 System.out.println("BootCamp,Java");
	}
}

class Year2022{
	public static void main(String[] args){
		Core2Web c2w = new Core2Web(){
			void lang(){
				System.out.println("BootCamp/Java/Python/OS");	
			}
		};
		c2w.lang();
	}
}
