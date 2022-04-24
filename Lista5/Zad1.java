package lista5;
import java.util.Scanner;
public class Zad1 {
	public static void main(String[] args) {
		
	int i,k,j;	
	Scanner skaner = new Scanner(System.in);
	System.out.println("Podaj rozmiar tablicy (liczba naturalna): " );
	int n= skaner.nextInt();
	int  tab [] []=  new int[n+1][n+1];
	
	if(n>=0)
	{
	//wiersze 	
	for( i=1; i<=n;i++)
{
	//Wyswietlanie od 1 do n w pionie i poziomie ( warto�ci pomocnicze)

	if(i == 1 )
	{
		System.out.print("    ");
		
		for(k=1;k<=n;k++) // drukuje nagłowki
		{
	
		System.out.print(String.format("%5d",k));
		
		}
	
		System.out.print("\n");
	}
	
	System.out.print(String.format("%5d", i ));
	
	
	//kolumny
	for( j=1; j<=n;j++)
	{
		tab[i][j]= i*j;
		System.out.print( String.format("%5d", tab[i][j]) );
	}
	
	System.out.println(""); 
}
	}
	else {
		System.out.println("Podana liczba nie jest naturalna!!!");
		
		}
	}
}
