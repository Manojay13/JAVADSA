interface  Dominos{
	public int itemNo = 5;
	String str1 = "Fries";
	String str2 = "";
	public void menuInfo();
}

class Users {
	public static void main(String[] args){
		Dominos dom =()->{
		String str1 = "veg";
		String str2 = "non-veg";
		System.out.println("itemNumber"+itemNo);
		};	
		dom.menuInfo();
		
	}
}
