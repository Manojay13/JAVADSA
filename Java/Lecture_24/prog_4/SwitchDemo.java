class SwitchDemo{
	public static void main(String[] args){
		int x =5;
		switch(x){
			default:
				System.out.println("No condition");
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("first five");
				break;
			case 5:
				System.out.println("scond five");
		}

		System.out.println("After switch");
	}
}
