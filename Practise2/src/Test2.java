import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(2);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(4);
		list2.add(8);
		list2.add(73);
		list2.add(2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		List<Integer> list3=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<list1.size() && j<list2.size())
		{
			if(list1.get(i)>list2.get(j))
			{
				list3.add(list2.get(j));
				j++;
			}
			else
			{
				list3.add(list1.get(i));
				i++;
			}
		}
		
		if(i<list1.size())
		{
			list1.subList(0, i).clear();
			list3.addAll(list3.size()-1, list1);
			
		}
		if(j<list2.size())
		{
			list2.subList(0, j).clear();
			list3.addAll(list3.size()-1,list2);
		}
		System.out.println(list3);
		
		
	}

}
