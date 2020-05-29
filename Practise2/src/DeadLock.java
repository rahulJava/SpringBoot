
public class DeadLock {
	
	public static void main(String[] args) {
		String x = "";
	}
	public void method1()
	{
		synchronized (String.class) {
			
			System.out.println("Got the String class Lock");
			synchronized (Integer.class) {
			
				
			}
			
		}
	}
	public void method2()
	{
		synchronized (Integer.class) {
			System.out.println("Got the Integer class Lock");
			synchronized (String.class) {
				
			}
			
		}
	}

}
