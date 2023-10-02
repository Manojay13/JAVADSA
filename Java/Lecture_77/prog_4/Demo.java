class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("In Run");
				//Thread.sleep(1000);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Interrupted Exception");
			}
		}
	}
}

class Demo{
	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		for(int i=0;i<10;i++){
			System.out.println("In main");
		}

	}
}

