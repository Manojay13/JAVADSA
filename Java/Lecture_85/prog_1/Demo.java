class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();

		al.add(10);//same as new Integer(10) as 10 converted into equivlent wrapper class
		al.add(new Integer(20));
		al.add(20);
		al.add(20);
		al.add(20);

		/*for(Integer obj:al){
			System.out.println(obj);
		}
		error: incompatible types: Object cannot be converted to Integer
		for(Integer obj:al){
		                ^
		This is because in foreach loop return type of any collectiom is object 
		
		Here var is alo not allowed as it says class var not exists
		*/

		for(Object obj:al){  //This is not standard solution as we dont know which type of datatype is that as Object is genric
                        System.out.println(obj);
                }

		for(int i = 0;i<al.size();i++)
			System.out.println(al.get(i));

	}
}
