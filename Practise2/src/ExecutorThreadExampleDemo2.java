import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class ExecutorThreadExampleDemo2 {
	public static ForkJoinPool forkJoinPool = new ForkJoinPool(2);
	public static void main(String[] args) {
		
		ExecutorService theExecutorService = Executors.newFixedThreadPool(10);
		//ForkJoinPool commonPool = ForkJoinPool.commonPool();
		
		//Creates a ForkJoinPool with parallelism equal to 
		//Runtime.availableProcessors(), using the 
		//default thread factory, no UncaughtExceptionHandler, 
		//and non-async LIFO processing mode.
		
		for(int i=0;i<20;i++)
		{
			//Runnable theRunnable = new WorkerThread1(i+" ");
			theExecutorService.execute(new WorkerThread1(i+" "));
			//theExecutorService.
		}
		System.out.println(Runtime.getRuntime().availableProcessors());
		theExecutorService.shutdown();
		while(!theExecutorService.isTerminated())
		{
			
		}
		System.out.println("All process are finished");
	

}


	
	
	
}
class WorkerThread1 implements Runnable
{

	public String name;
	
	public WorkerThread1(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "WorkerThread1 [name=" + name + "]";
	}

	

	@Override
	public void run() {
		try
		{
			System.out.println("Thread Name:"+Thread.currentThread().getName());
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		// TODO Auto-generated method stub
	
	}
