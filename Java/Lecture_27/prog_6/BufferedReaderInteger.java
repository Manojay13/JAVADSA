class BufferedReaderInteger{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter player name");
		String playerName=br.readLine();
		System.out.println("Enter age of player");
		//Lets try to enter age 
		//int age = br.readLine();
		//Let try to typecase it into int
		//int age = (int)br.readLine();
		int age = Integer.parseInt(br.readLine());
		System.out.println("Player name::"+playerName);
		System.out.println("Player's age::"+age);
	}
}
