
public class CreateRunnableThread implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi Inside line no 8");
		
	}
	public static void main(String[] args) {
		
		CreateRunnableThread t1 = new CreateRunnableThread();
		Thread t2 = new Thread(t1);
		t2.start();
	}

}
