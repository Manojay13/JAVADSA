class MyThread extends Thread{

}

class ThreadDemo{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		t.setPriority(7);	
		System.out.println(t.getPriority());
		//t.setPriority(11);	
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		t.start();
	}
}
