import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> list = new ArrayList<List<String>>();
		HashMap<String, List<String>>  map = new HashMap<String, List<String>>();
		if(strs.length==0)
			return list;

		
		for(String t:strs)
		{
			char[] c = t.toCharArray();
			Arrays.sort(c);
			String theString = String.valueOf(c);
			if(!map.containsKey(theString))
			{
				map.put(theString,new ArrayList<String>());
			}
			map.get(theString).add(t);
			
		}
		for(String x:map.keySet())
		{
			list.add(map.get(x));
		}
		return list;
	}
	

}
