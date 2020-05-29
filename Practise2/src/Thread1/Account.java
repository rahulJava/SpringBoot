package Thread1;

public class Account implements Runnable {

	private String command;
	public Account(String x)
	{
		this.command=x;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+command);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(Thread.currentThread().getName()+" Details Fetched");

	}
	@Override
    public String toString(){
        return this.command;
    }

}
