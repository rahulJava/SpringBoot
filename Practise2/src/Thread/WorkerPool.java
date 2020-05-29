   package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool
{
	public static void main(String[] args) throws InterruptedException {
		
		String s1 = new String();
		int n=15;//let no of accounts be 10;
		RejectedExecutionHandlerImpl theExecutionHandlerImpl= new RejectedExecutionHandlerImpl();
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor executorPool= new ThreadPoolExecutor(10, 10, 50, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1),threadFactory,theExecutionHandlerImpl);
		
		MonitorThread monitorThread = new MonitorThread(executorPool,3);
		Thread newThread = new Thread(monitorThread);
		newThread.start();
		for(int i=0;i<n;i++)
		{
			
			executorPool.execute(new Account("https:www.bofa1.com/accounts111"+i));
		}
		//executorPool.invokeAll(tasks, 500, TimeUnit.MILLISECONDS);
		//System.out.println("Perform completed");
		Thread.sleep(20000);
		
		executorPool.shutdown();
		Thread.sleep(5000);
		monitorThread.shutdown();
	}

}
