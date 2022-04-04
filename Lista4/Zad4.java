package lista4;

import java.text.ParseException;
import java.util.*; 
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Zad4 {

	public static void main(String[] args) throws ParseException{ 
		// TODO Auto-generated method stub
		
		TimeZone tz2 = TimeZone.getTimeZone("Asia/Tokyo");
		TimeZone tz3 = TimeZone.getTimeZone("Europe/Warsaw");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd.MM.yyyy");
		Date date = sdf.parse("28.03.2022");


		System.out.println(tz2.getRawOffset());
		System.out.println(tz2.inDaylightTime(date));
		long time = TimeUnit.MILLISECONDS.toHours(tz2.getRawOffset()); 

		System.out.println(tz3.inDaylightTime(date));
	
		long time1 = TimeUnit.MILLISECONDS.toHours(tz3.getRawOffset());
		
	
		if(!tz3.inDaylightTime(date) && !tz2.inDaylightTime(date) )
		{
			System.out.println("Przesuniêcie czasu o: " + tz3.getDSTSavings());
			long czas= time-time1;
			System.out.println("Ró¿nica czasu to: " + czas + " godz");
		}
		
		else if (!tz3.inDaylightTime(date) && tz2.inDaylightTime(date))
		{
			
			System.out.println("Przesuniêcie czasu o: " + tz3.getDSTSavings());
			time1-=1;
			long czas1=time-time1;
			System.out.println("Ró¿nica czasu to: " + czas1 + " godz" );

		}
		
		else if (tz3.inDaylightTime(date) && !tz2.inDaylightTime(date))
		{
			System.out.println("Przesuniêcie czasu o: " + tz3.getDSTSavings());
			time -=1; 
			long czas1=time-time1;
			System.out.println("Ró¿nica czasu to: " + czas1 + " godz");	
		}
		
		else if (tz3.inDaylightTime(date) && tz2.inDaylightTime(date))
		{
			System.out.println("Przesuniêcie czasu o: " + tz3.getDSTSavings());
			long czas1=time-time1;
			System.out.println("Ró¿nica czasu to: " + czas1 + " godz");
		}
	
	}

}