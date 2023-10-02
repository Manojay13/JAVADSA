class Demo{
	static int myLength(String str){
		char[] arr = str.toCharArray();
		int count=0;
		for(int x:arr){
			count++;
		}
		System.out.println(arr.getClass().getName());
		return count;
	}
	public static void main(String[] args){
		String str1 = "Manojay";
		char[] arr= str1.toCharArray();

		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println(str1.length());

		System.out.println(myLength(str1));
	}
}
