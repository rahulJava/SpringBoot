
public class ValidNumber {
	public static void main(String[] args) {
		
		String x = "12345980";
		ValidNumber v1 = new ValidNumber();
		boolean t1= v1.validNumber(x);
		System.out.println(t1);
	}
	public boolean validNumber(String s)
	{
		
		if(s==null)
		{
			return false;
		}
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c<'0' || c>'9') {
				return false;
			}
		}
		return true;
	}

}
