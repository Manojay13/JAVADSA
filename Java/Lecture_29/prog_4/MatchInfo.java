class MatchInfo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader  br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter matchInfo, Plyername,Category,Runs,Economy");
		java.util.StringTokenizer  str = new java.util.StringTokenizer(br.readLine()," ");
	
		System.out.println("matchInfo::"+str.nextToken()+"\nPlayerName::"+str.nextToken()+"\nCategory::"+str.nextToken().charAt(0)+"\nRuns::"+Integer.parseInt(str.nextToken())+"\nEconomy::"+Float.parseFloat(str.nextToken()));

		
	}
}
