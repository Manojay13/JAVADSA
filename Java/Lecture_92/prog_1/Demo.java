

class Demo{
	public static void main(String[] args) throws InterruptedException{
		java.util.concurrent.BlockingQueue bq = new java.util.concurrent.ArrayBlockingQueue(3);
		bq.offer(10);
		bq.offer(20);
		bq.put(30);

		System.out.println(bq);

		bq.offer(40,5,java.util.concurrent.TimeUnit.SECONDS);//it waits for 5 ms and after 5 seconds executes next line//offer(data,time,unitOfTime)
		System.out.println(bq);

		//take() -->Deletes element  throws InterruptedException
		bq.take();
		System.out.println(bq);

		//drainTo() -->moves delete data from one to other data structure  making first one empty
		java.util.ArrayList al = new java.util.ArrayList();
		System.out.println(al);
		bq.drainTo(al);
		System.out.println(al);
		System.out.println(bq);

	}
}
