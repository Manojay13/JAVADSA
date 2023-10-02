//Perfect square
//10*10 =100
//6*6=36
//take number from user and find square root
//do not use square root function from Math library

class Demo{
	static int sqrt(int num){
		int val=0;
		for(int i =1;i<num+1;i++){
			if(i*i==num)
				val= i;
		}
		return val;
	}

	public static void main(String[] args){
		int num =100;
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
