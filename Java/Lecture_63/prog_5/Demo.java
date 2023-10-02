class Demo{
	void fun(String str){
	
		System.out.println("In String");		
		}

	void fun(StringBuffer str1){
		
		System.out.println("In StringBuffer");		
		
	}
}


class Client{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("Core2Web"));
		String str = null;
		System.out.println(System.identityHashCode(str));
		String str1 = "";
		System.out.println(System.identityHashCode(str1));
		StringBuffer sb= null;
		System.out.println(System.identityHashCode(sb));
	}
}
