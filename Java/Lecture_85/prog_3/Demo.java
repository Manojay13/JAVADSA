class CricketPlayer{
	int jerseyNumber = 0;
	String name = null;

	CricketPlayer (int jerseyNumber,String name){
		this.jerseyNumber = jerseyNumber;
		this.name = name;
	}

	public String toString(){
		return (jerseyNumber+":"+name);
	}
}

class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add(new CricketPlayer(18,"Virat"));
		al.add(new CricketPlayer(7,"Dhoni"));
		al.add(new CricketPlayer(45,"Rohit"));

		System.out.println(al);
		al.add(1,"Hardik");
		al.add(2,new CricketPlayer(46,"Hardik"));
		System.out.println(al);
	}
}
