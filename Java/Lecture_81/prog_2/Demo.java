class MyThread implements Runnable{
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
		MyThread obj1 =new MyThread();	
		MyThread obj2 =new MyThread();	
		Thread t1 = new Thread(pThreadGP,obj1,"Maharastra");
		Thread t2 = new Thread(pThreadGP,obj2,"Goa");
		t1.start();
		t2.start();

		ThreadGroup cThreadGP = new ThreadGroup("Pakistan");
		MyThread obj3 = new MyThread();
		MyThread obj4 = new MyThread();
		Thread t3 = new Thread(cThreadGP,obj1,"Karachi");
		Thread t4 = new Thread(cThreadGP,obj2,"Lahore");
		t3.start();
		t4.start();
		/*	

		ThreadGroup cThreadGP2 = new ThreadGroup("Bangladesh");
		MyThread t5 = new MyThread(cThreadGP2,"Dhaka");
		MyThread t6 = new MyThread(cThreadGP2,"Mirpur");
		t5.start();
		t6.start();

		cThreadGP2.interrupt();
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());*/
	}
}
