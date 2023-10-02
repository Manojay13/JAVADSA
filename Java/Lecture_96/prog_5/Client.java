class Client{
	public static void main(String[] args)throws java.io.IOException{
		java.net.Socket s = new java.net.Socket("Localhost",1000);
		java.io.InputStream is = s.getInputStream();
		
		java.io.BufferedReader	br = new java.io.BufferedReader(new java.io.InputStreamReader(is));
		String str;
		
		while((str = br.readLine())!=null){
			System.out.println(str);
		}

		br.close();
		s.close();
	}
}
