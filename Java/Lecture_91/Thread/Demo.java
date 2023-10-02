class Demo extends Thread{
	public void run(){
	}
}
class Demo1 extends Thread{
	public void run(){
	}
}

class One{
	public static void main(String[] args){
		Demo t1 = new Demo();
		t1.start();
		System.out.println( t1.getPriority());
		System.out.println(t1.getName());
		Demo t2 = new Demo();
		t2.start();
		System.out.println( t2.getPriority());
		System.out.println(t2.getName());
	}
}
