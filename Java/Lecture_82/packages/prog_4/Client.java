import dummy.Addition;

class Client extends Addition{
	
	Client(int x,int y){
		super(x,y);
	}
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Client obj = new Client(x,y);
		
		System.out.println(obj.add());
	}
}
