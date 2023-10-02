class PlayerDemo{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter playerName,jerseyNumber,SpouseName::");
		String str = sc.nextLine();
		java.util.StringTokenizer st = new java.util.StringTokenizer(str," ");
		System.out.println(st.countTokens());
		//System.out.println(st.nextElement());
		//String playerName = st.nextToken();
		//String jerseyNumber = st.nextToken();
		//String SpouseName = st.nextToken();
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

		//System.out.println("PlayerName::"+playerName+"\njerseyNumber::"+jerseyNumber+"\nSpouseName::"+SpouseName);
		
	}
}
