class Demo{
	void m1(){}
	void m2(){}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1();
		obj = null;
		try{
		obj.m2();
		}catch(NullPointerException e){
			System.out.println("Object is having null Reference");	
		}finally{
			System.out.println("Normal Code");
		}
	}
}
