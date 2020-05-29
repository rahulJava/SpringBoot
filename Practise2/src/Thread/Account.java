package Thread;

public class Account implements Runnable {

private String command;
    
    public Account(String s){
        this.command=s;
    }
	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName()+command);
		 processCommand();
		 System.out.println(Thread.currentThread().getName()+" Details Fetched1");
		// TODO Auto-generated method stub

	}
	private void processCommand()
	{
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	@Override
    public String toString(){
        return this.command;
    }

}
