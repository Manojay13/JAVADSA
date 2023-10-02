class Match{
	void matchType(){
		System.out.println("T20/OneDay/Test");
	}
}
class TestWorldCup extends Match{
	void matchType(){
		System.out.println("TestCricket");
	}
}
class IPLMatch extends Match{
	void matchType(){
		System.out.println("T20Cricket");
	}
}


class Client{
	public static void main(String[] args){
		Match type1 = new IPLMatch();
		type1.matchType();
		Match type2 = new TestWorldCup();
		type2.matchType();
		Match type3 = new Match();
		type3.matchType();
	}
}
