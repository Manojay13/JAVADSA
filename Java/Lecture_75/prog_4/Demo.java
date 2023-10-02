
/*			Throwable
			    |
			Exception
			    |	
			RuntimeExceion
			    |
			IllegalArgumentException
	                    |
			NumberFormatException


*/
class Demo{
	public static void main(String[] args) throws java.io.IOException{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);	
		int data = 0;
		try{
		data = Integer.parseInt(br.readLine());
		System.out.println(data);
		}catch(IllegalArgumentException e){
			System.out.println("Please Enter the Integer data:");
			data = Integer.parseInt(br.readLine());	
		}catch(Exception e){
			System.out.println("Please Enter the Integer data:");
			data = Integer.parseInt(br.readLine());	
		}
	}
}
