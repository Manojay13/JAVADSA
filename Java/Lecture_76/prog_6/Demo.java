class DataOverflowException extends java.io.IOException{
	DataOverflowException(String str){
		super(str);//to  pass msg to parent	
	}

}
class DataUnderflowException extends java.io.IOException{
	DataUnderflowException(String str){
		super(str);
	}

}

class ArrayDemo{
	public static void main(String[] args) throws DataOverflowException,DataUnderflowException{
		int[] arr = new int[5];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Integer value");
		System.out.println("Note: 0<element<100");
		
		for(int i =0;i<arr.length;i++){
			int data = sc.nextInt();
			if(data<0)
				throw new DataUnderflowException("Number is less than 0");
			if(data>100)
				throw new DataOverflowException("Number is greater than 100");
			arr[i] = data;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
