
public class PriorityQueue2 
{
	int[] arr;
	int capacity;
	int front = 1;
    int rear ;
    int currentSize;
    int heapSize=0;
    private Task[] heap; 
	public PriorityQueue2()
	{
		this.capacity=3;
		this.rear=0;
		//this.arr= new int[capacity];
		this.capacity = 3 + 1;
        heap = new Task[this.capacity];
        heapSize = 0;
		
	}
	public void enque(int val)
	{
		if(isQueueFull())
		{
			increasingTheCapacity();
			System.out.println("Queue is full increasing the capacity");
		}
		currentSize++;
		this.arr[++rear]=val;
		
	}
	//priority queue
	public void insert(String job, int priority)
    {
        Task newJob = new Task(job, priority);
 
        heap[++rear] = newJob;
        int pos = rear;
        while (pos != 1 && newJob.priority > heap[pos/2].priority)
        {
            heap[pos] = heap[pos/2];
            pos /=2;
        }
        currentSize++;
        heap[pos] = newJob;    
    }
	
	public void increasingTheCapacity()
	{
		int newCapacity= this.arr.length*2;
		int[] arr1= new int[newCapacity];
		int tmpFront=front;
		int index=-1;
		while(true)
		{
			arr1[++index]=this.arr[tmpFront];
			tmpFront++;
			if(tmpFront==this.arr.length)
			{
				tmpFront=0;
			}
			if(currentSize==index+1)
				break;
		}
		this.capacity=newCapacity;
		arr=arr1;
		this.front=0;
		this.rear=index;
	}
	public boolean isQueueFull()
	{
		if(currentSize==capacity)
		{
			return true;
		}
		return false;
	}
	public void dequeue()
	{
		if(queusisEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
		
				System.out.println(arr[front++]);
			
			currentSize--;
		}
		
		
	}
	public void Prioritydequeue()
	{
		if(queusisEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
		
				System.out.println(heap[front++]);
			
			currentSize--;
		}
		
		
	}
	public boolean queusisEmpty()
	{
		if(currentSize==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		PriorityQueue2 q1 = new PriorityQueue2();
//		q1.enque(2);
//		q1.enque(3);
//		q1.enque(4);
//		q1.enque(5);
//		q1.enque(6);
//		q1.enque(7);
//		q1.dequeue();
//		q1.dequeue();
//		q1.dequeue();
//		q1.dequeue();
//		q1.dequeue();
		q1.insert("job1", 2);
		q1.insert("job2", 56);
		q1.insert("job3", 64);
		q1.Prioritydequeue();
		q1.Prioritydequeue();
		
	}

}
