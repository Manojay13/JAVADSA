class EvenOdd{
	public static void main(String[] args)throws java.io.IOException{
	 java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));	
	 System.out.print("Enter the number::");
	 int number = Integer.parseInt(br.readLine());

	 if(number==0){
	 	System.out.println("??????");
	 }else if(number%2==0){
	 	System.out.println(number+" is Even");
	 }else{
	 	System.out.println(number+" is Odd");
	}
     }
}
