

class Demo{
	public static void main(String[] args) throws InterruptedException{
		//java.util.concurrent.LinkedBlockingQueue bq = new java.util.concurrent.LinkedBlockingQueue();
		java.util.concurrent.LinkedBlockingQueue bq = new java.util.concurrent.LinkedBlockingQueue(3);//bounded and recommended
		bq.offer(10);
		bq.offer(20);
		bq.put(30);

		System.out.println(bq);

		bq.offer(40,5,java.util.concurrent.TimeUnit.SECONDS);//no need to stop
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
