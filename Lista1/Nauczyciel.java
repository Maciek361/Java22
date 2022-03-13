package lista1;
import java.util.Scanner;
public class Nauczyciel {

	public static void main(String[] args) {
		
		Uczen uczen1 = new Uczen("Maciej", 2002, 5, "Zielony" );
		Uczen uczen2 = new Uczen("Jan", 2003, 3, "Czerwony");
		
		System.out.println(uczen1);
		
		Scanner skaner = new Scanner(System.in);
		
		System.out.println("Podaj imie ucznia: ");
		String imie1 = skaner.nextLine();
		
		System.out.println("Podaj ulubiony kolor ucznia: ");
		String ulubionyKolor = skaner.nextLine();
		
		System.out.println("Rok studenta: ");
		String rok1 = skaner.nextLine();
		
		System.out.println("Imie pierwszego ucznia to: " + imie1);
		System.out.println("Ocena pierwszego ucznia to: " + uczen1.getOcena());
		System.out.println("Ulubiony kolor pierwszego ucznia to: " + ulubionyKolor);
		System.out.println("Rok pierwszego ucznia to: " + rok1 + "\n");
		
		
		
		System.out.println("Podaj imie ucznia: ");
		String imie2 = skaner.nextLine();
		
		System.out.println("Podaj ulubiony kolor ucznia: ");
		String ulubionyKolor1 = skaner.nextLine();
		
		System.out.println("Rok studenta: ");
		String rok2 = skaner.nextLine();
		skaner.close();
		
		System.out.println("Imie drugiego ucznia: " + imie2);
		System.out.println("Ocena drugiego ucznia to: " + uczen2.getOcena());
		System.out.println("Ulubiony kolor drugiego ucznia to: " + ulubionyKolor1);
		System.out.println("Rok drugiego ucznia to: " +  rok2 + "\n");
	}

	
	
	
}
