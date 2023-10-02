class Demo{
	public static void main(String[] args){
		java.util.ArrayList al = new java.util.ArrayList();
		al.add("MK");
		al.add("SK");
		al.add("TK");
		al.add("PK");
		al.add("LK");

		System.out.println(al);
		
		java.util.Iterator itr = al.iterator();

		while(itr.hasNext()){
			//System.out.println(itr.next());

			if("TK".equals(itr.next()))
					itr.remove();

			System.out.println(itr.next());
		}
		System.out.println(al);

	}
}
