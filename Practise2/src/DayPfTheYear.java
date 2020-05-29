class DayPfTheYear {
    public int dayOfYear(String date) {
        
       String[]x = date.split("-");
        
        int month = Integer.parseInt(x[1]);
        int year= Integer.parseInt(x[0]);
        int day = Integer.parseInt(x[2]);
        boolean flag=true;
        int res=0;
        for(int i=1;i<month;i++)
        {
            if(flag||i==8)
            {
                res+=31;
                flag=false;
            }
            else if(i==2)
            {
                
                if(isLeap(year))
                {
                    System.out.println("Inside leap year");
                    res+=29;
                    
                }
                else
                {
                    res+=28;
                }
                flag=true;
            }
            else
            {
                res+=30;
                flag=true;
            }
        }
        System.out.println(res);
        return res+day;
    }
    public boolean isLeap(int year)
    {
       if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            return true;
        }
        return false;
    }
        
}