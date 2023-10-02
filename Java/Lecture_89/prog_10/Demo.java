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
		Demo obj1 = new Demo("MK");
		Demo obj2 = new Demo("SK");
		Demo obj3 = new Demo("PK");
		java.util.WeakHashMap hm = new java.util.WeakHashMap();

		hm.put(obj1,2016);
		hm.put(obj2,2017);
		hm.put(obj3,2018);
		obj1 = null;
		System.gc();

		System.out.println(hm);

	}
}
