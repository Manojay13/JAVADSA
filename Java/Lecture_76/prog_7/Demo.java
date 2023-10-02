class Demo{
	public static void main(String[] args){
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int data =0;
		try{
			 data = Integer.parseInt(br.readLine());
		}catch(java.io.IOException e){
                        System.out.println("IO Exception");
                }catch(NumberFormatException e){
			System.out.println("NumberFormat Exception");
		}catch(NullPointerException e){
			System.out.println("NullPointer Exception");
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}
	}
}
