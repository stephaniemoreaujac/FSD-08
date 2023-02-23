
public class SysTime {

	public static void main(String[] args)
    {
		System.out.println("---" + System.currentTimeMillis());
		
		System.out.println("Since Januaray 1st, 1970 0:00:00.00");
        long curTime = System.currentTimeMillis();
        // Milliseconds 
        System.out.println("Milliseconds : " + curTime);
 
        // Seconds
        long seconds = curTime / 1000;
        System.out.println("Seconds : " + seconds);
 
        // Minutes
        long minutes = seconds / 60; // curtime / 1000 / 60
        System.out.println("Minutes : " + minutes);
 
     // Hours
        long hours = minutes / 60;
        System.out.println("Hours : " + hours);
 
     // Days
        long days = hours / 24;
        System.out.println("Days : " + days);
 
     // Years
        long years = days / 365;
        System.out.println("Years : " + years);
 
		System.out.println("---" + System.currentTimeMillis());

    }
	
	
}
