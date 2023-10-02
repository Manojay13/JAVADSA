class Demo{
	public static void main(String[] args){
		java.util.Queue que = new java.util.LinkedList();

		System.out.println(que);

		//poll
		que.poll();//doesnt throws exception
		//que.remove();//throws exception at runtime
		System.out.println(que);
		
		//peek()
		que.peek();//doesnt throws exception
		//que.element();//throws runtime exception
		System.out.println(que);
	}
}
