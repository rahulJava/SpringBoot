

//Longest Palindromic Substring
class LongestPalindromicSubString {
	public static void main(String[] args) {
		String x="racecar";
		LongestPalindromicSubString l1 = new LongestPalindromicSubString();
		String y =l1.longestPalindrome(x);
		System.out.println(y);
	}
    private int start=0;
     private  int end=0;
    public String longestPalindrome(String s) {
        
    if(s==null || s.length()<1)return ""; 
        
        
        
        for(int i=0;i<s.length();i++)
        {
             expandFromMiddle(s,i,i);//racecar
             expandFromMiddle(s,i,i+1);//aabbaa
            
        }
        return s.substring(start,start+end);
    }
    public void expandFromMiddle(String s, int left, int right)
    {
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        
        if (end < right - left - 1) 
    {
		start = left + 1;
		end = right - left - 1;
	}
        
        
    }
}