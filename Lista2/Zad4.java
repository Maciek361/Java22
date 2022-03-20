package Lista2_4;

public class Zad4 {

	  public static void main(String[] args)
	    {
	        Date dt1 = new Date(1, 1, 2002);
	        Date dt2 = new Date(1, 1, 2004);
	        System.out.println("Liczba dni pomiêdzy datami: " +
	                            getDifference(dt1, dt2));
	        
	    }
	  
	 static class Date
	    {
	        int d, m, y;
	 
	        public Date(int d, int m, int y)
	        {
	            this.d = d;
	            this.m = m;
	            this.y = y;
	        }
	 
	    };

	    static int countLeapYears(Date de)
	    {
	        int years = de.y;
	 
	       
	        if (de.m <= 2)
	        {
	            years--;
	        }
	 
	       
	        return years / 4 - years / 100 + years / 400; //znajduje ile lat przystêpnych mine³o od 1 daty
	        
	    }
	 
	    static int monthDays[] = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
	    
	    static int getDifference(Date dt1, Date dt2) // oblicza róznice dni 
	    {
	       
	        int n1 = dt1.y * 365 + dt1.d; //iles dni jaka minela w dt1 od podanej daty
	 
	       
	        for (int i = 0; i < dt1.m - 1; i++)
	        {
	            n1 += monthDays[i];
	        }
	 
	       
	        n1 += countLeapYears(dt1);
	 
	        int n2 = dt2.y * 365 + dt2.d;
	        
	        for (int i = 0; i < dt2.m - 1; i++)
	        {
	            n2 += monthDays[i];
	        }
	        n2 += countLeapYears(dt2);
	        return (n2 - n1);
	         
	    }
   
	   
	}

