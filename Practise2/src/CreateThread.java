
public class CreateThread extends Thread
{
	public static void main(String[] args) {
		
		CreateThread t1 = new CreateThread();
		t1.start();
	}
	public void run()
	{
		System.out.println("How are you");
	}
	

}


