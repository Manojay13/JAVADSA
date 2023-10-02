import arithfun.Addition;

class Client{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Addition obj = new Addition(x,y);
		System.out.println(obj.add());
	}
}
