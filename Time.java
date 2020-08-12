package convertor;
import java.util.*;
public class Time
{
	int sec,min,hr;
	public void time_conv()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter seconds");
		sec=in.nextInt();
		if(sec>3600)
		{
			min=sec/60;
			sec=sec%60;
			hr=min/60;
			min=min%60;
		}
		else
		{
			hr=00;
			min=sec/60;
			sec=sec%60;
		}
		System.out.println("HR:"+hr+"MIN:"+min+"SEC:"+sec);
	}
}