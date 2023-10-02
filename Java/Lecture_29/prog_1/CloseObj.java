class CloseObj{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		java.io.BufferedReader br2 = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		br.close();
		br2.readLine();
	}
}
