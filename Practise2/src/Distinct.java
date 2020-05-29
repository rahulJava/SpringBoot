import java.util.HashMap;

public class Distinct {
	public static void main(String[] args) {
		
		String ex="Geeks for Geeks";
		Distinct d1 = new Distinct();
		d1.distinct(ex);
		
	}
	public void distinct(String ex )
	{
		String unique="";
		HashMap<String, Integer> distinct = new HashMap<String, Integer>();
		String[] split=ex.split("\\s+");
		for(int i=0;i<split.length;i++)
		{
			
			{
				distinct.put(split[i], distinct.getOrDefault(split[i], 0)+1);
			}
			
			
		}
		for(String x:distinct.keySet())
		{
			if(distinct.get(x)==1)
			{
				System.out.println(x);
			}
		}
		
	}

}
