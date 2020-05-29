

public class IntersectionLinkedList 
{
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 
		 ListNode w1 = headA;
		 ListNode w2= headB;
		 
		 while(w1!=w2)
		 {
			 if(w1==null)
			 {
				 w1=headB;
			 }
			 else
			 {
				 w1=w1.next;
			 }
			 if(w2==null)
			 {
				 w2=headA;
			 }
			 else
			 {
				 w2=w2.next;
			 }
		 }
		 return w1;
	 }

}
