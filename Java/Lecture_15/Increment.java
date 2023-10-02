class Increament{
	public static void main(String[] args){
		int x = 1;
		x = x++;//1
		System.out.println(x);
		x=x+++ x++ ;//3
		System.out.println(x);
		x=x++ + x++ +x++;//3+4+5=12
		System.out.println(x);
		x=x++ + x++ +x++ +x++;//12+13+14+15
		System.out.println(x);
	}
}
