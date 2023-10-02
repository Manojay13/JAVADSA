//runnable because excute has parameter runnable
class MyThread implements Runnable{
	int num;
	MyThread(int num){
		this.num = num;
	
	}

	public void run(){
		System.out.println(Thread.currentThread()+"start thread::"+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End thread::"+num);

	}

	void dailyTask(){
		try{
			Thread.sleep(8000);
		}catch(InterruptedException ie){

		}
	}
}

class ThreadPoolDemo{
	public static void main(String[] args){
		java.util.concurrent.ExecutorService ser= java.util.concurrent.Executors.newFixedThreadPool(3);

		for(int i =1;i<7;i++){
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
