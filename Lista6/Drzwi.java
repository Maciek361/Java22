package lista6;

public interface Drzwi {
	
	int iloscDrzwi();
	public default void cechaDrzwi()
	{
		System.out.println("Wszystkie samochody posiadaja drzwi");
	}

}