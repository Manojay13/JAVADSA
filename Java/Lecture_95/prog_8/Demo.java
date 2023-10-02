class Player implements java.io.Serializable{
	Integer jerseyNumber ;
	String playerName;
	Player(Integer jerseyNumber,String playerName){
		this.jerseyNumber = jerseyNumber;
		this.playerName =playerName;
	}
}
class Demo{
	public static void main(String[] args)throws java.io.IOException{
		Player obj1 = new Player(1,"KL rahul");
		Player obj2 = new Player(2,"Rohit Sharma");
		
		java.io.FileOutputStream fos = new java.io.FileOutputStream("PlayerData.txt");
		java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);

		oos.writeObject(obj1);
		oos.writeObject(obj2);
	}
}
