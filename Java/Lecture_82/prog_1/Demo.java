class MyThread implements Runnable{
	int num = 0;

	MyThread(int num){
		this.num =num;
	}
	public void run(){
		System.out.println("Start:"+num+Thread.currentThread());
		dailyTask();
		System.out.println("End:"+num+Thread.currentThread());
	}

	void dailyTask(){
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie){
			
		}
	}
}

class ThreadPoolDemo{
	public static void main(String[] args){
		java.util.concurrent.ThreadPoolExecutor ser = (java.util.concurrent.ThreadPoolExecutor)java.util.concurrent.Executors.newFixedThreadPool(5);
		
		for(int i=1;i<11;i++){
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();

	}
}
