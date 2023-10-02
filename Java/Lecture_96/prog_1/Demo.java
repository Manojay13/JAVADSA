class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new  java.io.InputStreamReader(System.in));
		String site = br.readLine();
		java.net.InetAddress ip = java.net.InetAddress.getByName(site);
		System.out.println(ip);

	}
}
