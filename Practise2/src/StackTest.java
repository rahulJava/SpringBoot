
public class StackTest 
{
	
	int[] arr;
	int capacity;
	int top;
	public  StackTest()
	{
		this.top=-1;
		this.capacity=3;
		arr= new int[capacity];
	}
	public void push(int val)
	{
		if(isStackFull())
		{
			System.out.println("Stack is full increasing the capacity");
			this.increaseTheCapacity();
		}
		arr[++top]=val;
	}
	public boolean isStackFull()
	{
		if(arr.length==capacity)
			return true;
		return false;
	}
	public int peek()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
		}
		return arr[top];
	}
	public void increaseTheCapacity()
	{
		int[] arr1 = new int[2* arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=this.arr[i];
		}
		this.capacity=2*arr.length;
		this.arr=arr1;
	}
	public int pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty()");
			return -1;
		}
		return arr[top--];
	}
	public boolean isStackEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		
		StackTest test = new StackTest();
		for(int i=0;i<10;i++)
		{
			test.push(i);
		}
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(test.pop());
//		}
		System.out.println(test.peek());
		
		
	}

}
