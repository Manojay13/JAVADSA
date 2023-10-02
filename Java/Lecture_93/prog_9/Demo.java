class Demo implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{
	//for Thread use lambda function
	public static void main(String[] args){
		Demo dObj = new Demo();
		Thread t1 = new Thread(dObj);
		t1.start();
		
		Thread t2 = new Thread(dObj);
		t2.start();
	}
}
