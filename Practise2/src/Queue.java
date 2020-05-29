
public class Queue 
{
	int[] arr;
	int capacity;
	int front = 0;
    int rear ;
    int currentSize;
	public Queue()
	{
		this.capacity=3;
		this.rear=-1;
		this.arr= new int[capacity];
		
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
//			if(tmpFront==this.arr.length)
//			{
//				tmpFront=0;
//			}
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
	public boolean queusisEmpty()
	{
		if(currentSize==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Queue q1 = new Queue();
		q1.enque(2);
		q1.enque(3);
		q1.enque(4);
		q1.enque(5);
		q1.enque(6);
		q1.enque(7);
		q1.enque(2);
		q1.enque(3);
		q1.enque(4);
		q1.enque(5);
		q1.enque(6);
		q1.enque(7);
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		
		
	}

}
