
public class Thread3  implements Runnable{
	public static void main(String[] args) {
		System.out.println();
		
		Thread3 t3 = new Thread3();
		Thread t1 = new Thread(t3);
		t1.start();
		
		Thread t2 = new Thread(t3);
		t2.start();
		
	}

	@Override
	public void run() {
		
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		// TODO Auto-generated method stub
		
	}

}
