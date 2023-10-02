class Server{
	public static void main(String[] args)throws java.io.IOException{
		java.net.ServerSocket ss = new java.net.ServerSocket(1000);	

		java.net.Socket s= ss.accept();
		System.out.println("Connection Established");

		java.io.OutputStream os = s.getOutputStream();
		
		java.io.PrintStream ps = new java.io.PrintStream(os);

		ps.println("Hello Client");
		ps.println("Bye");

		ps.close();
		s.close();
		ss.close();
	}
}
