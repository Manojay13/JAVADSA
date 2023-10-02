class Producer implements Runnable{
	java.util.concurrent.BlockingQueue bq = null;
	Producer(java.util.concurrent.BlockingQueue bq){
		this.bq = bq;
	}

	public void run(){
	
			for(int i =1;i<11;i++){
				try{
				bq.put(i);
				System.out.println("Produce::"+i);
				}
				catch(InterruptedException e){}
				 try{
                        Thread.sleep(1000);
                }catch(InterruptedException e){

                }

	}
		
	}
}
class Consumer implements Runnable{
	java.util.concurrent.BlockingQueue bq = null;
	Consumer(java.util.concurrent.BlockingQueue bq){
		this.bq = bq;
	}
	public void run(){
	
			for(int i =1;i<11;i++){
				try{
				bq.take();
				System.out.println("Consume::"+i);
				}
				catch(InterruptedException e){}
				                try{
                        Thread.sleep(3000);
                }catch(InterruptedException e){

                }
	}
	
	}
}

class ProducerConsumerDemo{
	public static void main(String[] args){
		java.util.concurrent.BlockingQueue bq = new java.util.concurrent.ArrayBlockingQueue(3);

		//tell Consumer and producer that you have to working on this queue i.e.common plateform

		Producer produce = new Producer(bq);
		Consumer consume =  new Consumer(bq);

		Thread producerThread = new Thread(produce);
		Thread consumerThread = new Thread(consume);

		producerThread.start();
		consumerThread.start();
	}
}
