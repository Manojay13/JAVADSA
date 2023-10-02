class Demo{
	void getData() throws java.io.IOException{
		java.io.BufferedReader  br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			int data = Integer.parseInt(br.readLine());
			System.out.println(data);
		}catch(java.lang.NumberFormatException 	obj){
			System.out.println(obj);
			obj.printStackTrace();
		}
	}
	public static void main(String[] args) throws java.io.IOException{
		Demo obj = new Demo();
		obj.getData();
	}
}
