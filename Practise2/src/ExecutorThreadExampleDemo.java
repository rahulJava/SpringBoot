import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadExampleDemo {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newScheduledThreadPool(5);
		
		for(int i=0;i<10;i++)
		{
			Runnable theRunnable = new WorkerThread(i+" ");
			executorService.execute(theRunnable);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
        }
		System.out.println("Finished all the Threads");
	}

}

class WorkerThread implements Runnable
{
	String command;

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		processCommand();
		// TODO Auto-generated method stub
		
	}
	public WorkerThread(String command) {
		super();
		this.command = command;
	}
	public void processCommand()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Override
	public String toString() {
		return "WorkerThread [command=" + command + "]";
	}
	
	
}
