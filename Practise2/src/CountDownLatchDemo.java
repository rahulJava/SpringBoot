import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class CountDownLatchDemo {
	public static void main(String[] args) {
		
		final CountDownLatch  latch = new CountDownLatch(3);
		
		Thread cacheService = new Thread(new Servive("service", 1000, latch) );
		Thread data = new Thread(new Servive("data", 1000, latch) );
		Thread app = new Thread(new Servive("app", 1000, latch) );
		cacheService.start();
		data.start();
		app.start();
		
		try {
			latch.await();
			System.out.println("All service are up");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
			
		
		
	}
	

}
class Servive implements Runnable
{
	private String name;
	private int time;
	private final CountDownLatch latch;
	

	@Override
	public void run() {
		try {
		Thread.sleep(time);
		}
		catch (InterruptedException e) {
			System.out.println("Inside logger");
			// TODO: handle exception
		}
		System.out.println(name+"System is up");
		
		// TODO Auto-generated method stub
		latch.countDown();
		
	}


	public Servive(String name, int time, CountDownLatch latch) {
		super();
		this.name = name;
		this.time = time;
		this.latch = latch;
	}
	
}
