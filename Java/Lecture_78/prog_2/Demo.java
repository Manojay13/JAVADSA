class MyThread extends Thread{
	public void run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());

	}
	public void start(){}
}

class Demo{
	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		System.out.println(Thread.currentThread().getName());
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}

