class CricketDemo{
	public static void main(String[] args) {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
		System.out.print("Enter the Batsman  name::");
		String batsman = br.readLine();
		System.out.print("Enter the   Bowler name::");
		String bowler = br.readLine();
		System.out.println("Batsman's name::"+batsman);
		System.out.println("Bowler's name::"+bowler);
		
	}
}
