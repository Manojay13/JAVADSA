class ForEachDemo{
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		/*for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);*/

		for(int a: arr){
			System.out.println(a);
			System.out.println(arr[0]);//error
		}
		for(float a: arr){
			System.out.println(a);
		//	System.out.println(a[0]);//error
		}

	}
}
