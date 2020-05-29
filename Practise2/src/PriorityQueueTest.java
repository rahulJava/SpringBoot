/**
 ** Java Program to implement Priority Queue
 **/
 
import java.util.Scanner;
 
/** class Task **/
class Task
{
    String job;
    int priority;
 
    /** Constructor **/
    public Task(String job, int priority)
    {
        this.job = job;
        this.priority = priority; 
    }
    /** toString() **/
    public String toString() 
    {
        return "Job Name : "+ job +"\nPriority : "+ priority;
    }
}
 
/** Class PriorityQueue **/
class PriorityQueue
{
    private Task[] heap; 
    private int heapSize, capacity;
 
    /** Constructor **/
    public PriorityQueue(int capacity)
    {    
        this.capacity = capacity + 1;
        heap = new Task[this.capacity];
        heapSize = 0;
    }
    /** function to clear **/
    public void clear()
    {
        heap = new Task[capacity];
        heapSize = 0;
    }
    /** function to check if empty **/
    public boolean isEmpty()
    {
        return heapSize == 0;
    }
    /** function to check if full **/
    public boolean isFull()
    {
        return heapSize == capacity - 1;
    }
    /** function to get Size **/
    public int size()
    {
        return heapSize;
    }
    /** function to insert task **/
    public void insert(String job, int priority)
    {
        Task newJob = new Task(job, priority);
 
        heap[++heapSize] = newJob;
        int pos = heapSize;
        while (pos != 1 && newJob.priority > heap[pos/2].priority)
        {
            heap[pos] = heap[pos/2];
            pos /=2;
        }
        heap[pos] = newJob;    
    }
    /** function to remove task **/
    public Task remove()
    {
        int parent, child;
        Task item, temp;
        if (isEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        }
 
        item = heap[1];
        temp = heap[heapSize--];
 
        parent = 1;
        child = 2;
        while (child <= heapSize)
        {
            if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                child++;
            if (temp.priority >= heap[child].priority)
                break;
 
            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
 
        return item;
    }
   }
 
/** Class PriorityQueueTest **/
public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        
        PriorityQueue pq = new PriorityQueue(5);
        pq.insert("Job1", 24); 
        pq.insert("Job2", 25); 
        pq.insert("Job3", 26); 
        pq.insert("Job4", 27); 
        pq.insert("Job4", 242); 
        
        System.out.println(pq.remove());
        pq.isEmpty();
        pq.size();
        
           
    }
}