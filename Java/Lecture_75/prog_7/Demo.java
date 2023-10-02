class Demo{
	public static void main(String[] args) throws java.lang.InterruptedException{
		for(int i =0;i<10;i++){
			System.out.println("In loop");
			try{
				Thread.sleep(5000);
			}catch(java.io.IOException e ){
				
			}
		}
	}
}
