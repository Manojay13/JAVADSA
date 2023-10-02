class Demo{
	public static void main(String[] args)throws java.net.MalformedURLException{
		java.net.URL obj = new java.net.URL("https://www.core2web.in");
		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());
	}
}
