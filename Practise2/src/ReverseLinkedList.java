import java.util.Stack;

public class ReverseLinkedList 
{
	 public ListNode reverseList(ListNode head) {
		 
		 Stack<ListNode> stack = new Stack();
		 
		 while(head!=null)
		 {
			 stack.push(head);
			 head=head.next;
		 }
		 
		 ListNode list = new ListNode(-1);
		 ListNode fake=list;
		 
		 while(!stack.isEmpty())
		 {
			 ListNode curr= stack.pop();
			 list.next=new ListNode(curr.val);
			 list=list.next;
		 }
		 return fake.next;
		 
	 }

}
