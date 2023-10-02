class Demo{
	public static void main(String[] args){
/*
 *	method:public int indexOf(int ch,int fromIndex);
 *	description:finds first instance of character in given string 
 *	parameter:character (ch to find), character(index to start with search)
 *	returnType:Integer
 * */

	String str ="Shashi";
	System.out.println(str.indexOf('h',0));
	System.out.println(str.indexOf('h',1));
	System.out.println(str.indexOf('h',2));
	System.out.println(str.indexOf('h',4));
	}
}
