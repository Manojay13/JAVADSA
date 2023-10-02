class NestedSwitch{
	public static void main(String[] args){
		String str = "Netflix";

		System.out.println("Before switch");
		switch(str){
			case "Prime Video":{
				String str1 = "Movies";
				switch(str1){
					case "Movies":
						System.out.println("Marathi Movies");
						break;
					case "TV Shows":
						System.out.println("TV Shows");
						break;
				}
			}

			case "Netflix":{
				String str1 = "Movies";
				switch(str1){
					case "Movies":
						System.out.println("Hindi Movies");
						break;
					case "TV Shows":
						System.out.println("TV shows");
						break;
				
				}
			}
		}

		System.out.println("After  switch");
	}
}
