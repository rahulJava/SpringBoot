package ThreadExample;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class DemonstrationFuture {
  
    static ExecutorService threadPool = Executors.newSingleThreadExecutor();
  
    public static void main( String args[] ) throws Exception {
        System.out.println("In line no 15:"+pollingStatusAndCancelTask(10000));
        threadPool.shutdown();
    }
  
    static int pollingStatusAndCancelTask(final int n) throws Exception {
        
        int result = -1;

        Callable<String> sumTask1 = new Callable<String>() {

            public String call() throws Exception {

                // wait for 10 milliseconds
                //Thread.sleep(100);
            	
                int sum = 0;
                for (int i = 1; i <= n; i++)
                    sum += i;
                return ""+sum;
            }
        };

        	
        Callable<String> randomTask = new Callable<String>() {

            public String call() throws Exception {

                // go to sleep for an hours
            	//Thread.sleep(60 * 1000);
                return "Test Random Task";
            }
            
        };

       // Future<Integer> f1 = threadPool.submit(sumTask1);
       // Future<Void> f2 = threadPool.submit(randomTask);
        List<Callable<String>>  callables = Arrays.asList(
        		  sumTask1,randomTask 
        		);
        List<Future<String>> futures = threadPool.invokeAll(callables, 500, TimeUnit.MILLISECONDS);
        //threadPool
        futures.forEach(futureResponse -> {
        	try {
				System.out.println(futureResponse.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Cancellation Exception...");
				e.printStackTrace();
			} catch (ExecutionException e) {
				System.out.println("Cancellation ExecutionException...");
				e.printStackTrace();
			}
        	System.out.println("Finally Success !!!");
        });	 

//        // Poll for completion of first task
//        try {
//
//            // Before we poll for completion of second task,
//            // cancel the second one
//            f2.cancel(true);
//
//            // Polling the future to check the status of the
//            // first submitted task
//            while (!f1.isDone()) {
//                System.out.println("Waiting for first task to complete.");
//            }
//            result = f1.get(5, TimeUnit.MILLISECONDS);
//        } catch (ExecutionException ee) {
//            System.out.println("Something went wrong.");
//        }

        //System.out.println("\nIs second task cancelled : " + f2.isCancelled());
        
        threadPool.awaitTermination(700, TimeUnit.MILLISECONDS);
        
        return result;      
    } 
}