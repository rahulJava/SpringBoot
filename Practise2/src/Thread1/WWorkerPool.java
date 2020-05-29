package Thread1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Thread.RejectedExecutionHandlerImpl;

public class WWorkerPool 
{
	public static void main(String[] args) {
		int n=10;
		RejectedExecutionHandlerImpl theExecutionHandlerImpl= new RejectedExecutionHandlerImpl();
		ThreadFactory theFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor executorPool= new ThreadPoolExecutor(10, 10, 50, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1),theFactory,theExecutionHandlerImpl);
		
		for(int i=0;i<n;i++)
		{
			executorPool.execute(new Account("https://www.bofa.com/accpunts/"+i));
		}
		executorPool.shutdown();
	}
	

}
