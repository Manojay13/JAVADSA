class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroupDemo{
	public static void main(String[] args) {
		ThreadGroup pThreadGP = new ThreadGroup("India");
		MyThread t1 = new MyThread(pThreadGP,"Maharashtra");
		MyThread t2 = new MyThread(pThreadGP,"Goa");
		t1.start();
		t2.start();

		ThreadGroup cThreadGP = new ThreadGroup("Pakistan");
		MyThread t3 = new MyThread(pThreadGP,"Lahore");
		MyThread t4 = new MyThread(pThreadGP,"Karachi");
		t3.start();
		t4.start();
		

		ThreadGroup cThreadGP2 = new ThreadGroup("Bangladesh");
		MyThread t5 = new MyThread(cThreadGP2,"Dhaka");
		MyThread t6 = new MyThread(cThreadGP2,"Mirpur");
		t5.start();
		t6.start();

		cThreadGP2.interrupt();
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	}
}
