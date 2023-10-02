class Demo{
	public static void main(String[] args)throws java.io.IOException,java.lang.ClassNotFoundException{
		
		java.io.FileInputStream fis = new java.io.FileInputStream("PlayerData.txt");
		java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
		
		Player obj1 = (Player)ois.readObject();
		Player obj2 = (Player)ois.readObject();
		ois.close();
		fis.close();

		System.out.println("JerseyNumber::"+obj1.jerseyNumber);
		System.out.println("playerName::"+obj1.playerName);
		System.out.println("JerseyNumber::"+obj2.jerseyNumber);
		System.out.println("playerName::"+obj2.playerName);
	}
}
