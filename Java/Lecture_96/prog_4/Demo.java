class Demo {
	public static void main(String[] args) throws java.io.IOException{
			java.net.URL obj = new java.net.URL("https://www.youtube.com");	
			java.net.URL obj2 = new java.net.URL("https://www.core2web.in");	
			java.net.URLConnection conn = obj.openConnection();
			java.net.URLConnection conn2 = obj2.openConnection();

			System.out.println("Last modified"+new java.util.Date(conn.getLastModified()));
			System.out.println("Last modified"+new java.util.Date(conn2.getLastModified()));
			System.out.println("Last modified"+conn.getContentType());
	}
}
