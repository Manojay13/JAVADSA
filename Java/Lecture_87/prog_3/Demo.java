class CricketPlayer{
	int jerseyNumber = 0;
	String name = null;
	CricketPlayer(int jerseyNumber,String name){
		this.jerseyNumber = jerseyNumber;
		this.name = name;
	}
}

class Demo{
	public static void main(String[] args){
		java.util.LinkedHashSet hs= new java.util.LinkedHashSet();
		hs.add(new CricketPlayer(7,"Dhoni"));
		hs.add(new CricketPlayer(11,"Rohit"));
		hs.add(new CricketPlayer(28,"Rahul"));
		hs.add(new CricketPlayer(7,"Dhoni"));

		System.out.println(hs);
	}
}
