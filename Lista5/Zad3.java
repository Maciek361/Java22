package lista5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Zad3 {
	public static void main(String[] args) throws ParseException {
		
		ArrayList<Date> datesList = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Scanner scanner= new Scanner(System.in);
		
		
		for(int i=0; i<=4;i++)
		{
			while(i>3)
			{
				while(true)
				{
					System.out.println("Rozmiar tablicy przekroczyl 4 elementy, kolejne daty nie zostana dodane do sortowania");
					String input= scanner.nextLine();
					Date date1 = simpleDateFormat.parse(input);
				}
			}
			
		System.out.println("Wprowadz date "+ (i+1) +":");
		String input= scanner.nextLine();
		Date date1 = simpleDateFormat.parse(input);
		datesList.add(date1);
		if(i==1)
		{
			
				while(datesList.get(i).equals(datesList.get(i-1)))
				{
					datesList.remove(1);
					System.out.println("Wprowadz date "+ (i+1) + " (Daty siê powtarzaj¹):");
					input= scanner.nextLine();
					date1 = simpleDateFormat.parse(input);
					datesList.add(date1);
					
				}
		}
		
		if(i==2)
		{
			
				while(datesList.get(i).equals(datesList.get(i-1)) || datesList.get(i).equals(datesList.get(i-2)))
				{
					datesList.remove(2);
					System.out.println("Wprowadz date "+ (i+1) + " (Daty siê powtarzaj¹):");
					input= scanner.nextLine();
					date1 = simpleDateFormat.parse(input);
					datesList.add(date1);
				}
		}
		if(i==3)
		{
				while(datesList.get(i).equals(datesList.get(i-1)) || datesList.get(i).equals(datesList.get(i-2))|| datesList.get(i).equals(datesList.get(i-3)))
				{
					datesList.remove(3);
					System.out.println("Wprowadz date "+ (i+1) + " (Daty siê powtarzaj¹):");
					input= scanner.nextLine();
					date1 = simpleDateFormat.parse(input);
					datesList.add(date1);
				}
		}
		if(i<=3)
		{
		 Collections.sort(datesList);
		 System.out.println("\t\t\t\t\t Posortowane daty: ");
		 for (Date dates : datesList) {  
	           
	            System.out.println("\t\t\t\t\t"+dates);  
		 		}
		 
		 
		}
		}				
	}
}
