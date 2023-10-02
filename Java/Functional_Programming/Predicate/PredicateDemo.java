//Predicate-->Accepts one argument as input and returns boolean
//Used to check condtional expressions

class PredicateDemo{
	public static void main(String[] args){
		java.util.function.Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(5));

		//example 2
		//check if length of string is greater than 4 or not
		java.util.function.Predicate<String> str = s->(s.length()>4);
		System.out.println(str.test("Hello"));
		System.out.println(str.test("one"));

		//Example 3
		String[] names = {"David","Goliath","Mary","Joseph"};
		
		for(String name:names){
			if(str.test(name))
				System.out.println(name);
			}
		
		}
		
}

