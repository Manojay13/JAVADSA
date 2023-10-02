class Demo{
	public static void main(String[] args)throws java.io.IOException, java.net.URISyntaxException{
		java.net.URI obj= new java.net.URI("https://www.youtube.com");	
		java.awt.Desktop desk =  java.awt.Desktop.getDesktop();
		desk.browse(obj);
	}
}
