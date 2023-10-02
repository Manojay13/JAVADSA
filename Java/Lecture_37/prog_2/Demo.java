class Demo{
	static void fun(int[] arr){
		System.out.println(arr);
		arr[0] =50;
		for(int x: arr){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		int[] arr = {10,20,30};
		for(int x: arr){
			System.out.println(x);
		}
		
		System.out.println(arr);
		//Lets send array to function
		fun(arr);
		for(int x: arr){
			System.out.println(x);
		}
	}
}
