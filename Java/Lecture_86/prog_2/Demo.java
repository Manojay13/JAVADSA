class Demo{
	public static void main(String[] args){
		java.util.Stack s = new java.util.Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.pop();
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(30));
	}
}
