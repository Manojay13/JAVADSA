class Demo{

		String str ;
		Demo(String str){
			this.str = str;
		}

	public String toString(){
		return str;
	}

	public void finalize(){
		System.out.println("Notify");
	}


}

class GCDemo{
	public static void main(String[] args){
		Demo obj = new Demo("MK");

		System.out.println(obj);

		obj = null;
		//garabge collector waits if it is being used in future
		//to do this call System.gc();
		System.gc();
		System.out.println("In main");
	}
}
