package lista6;

public class Papiery extends samochodOsobowy implements Silnik, Drzwi, OCAC {

	String prawoJazdy;
	@Override
	public boolean AC() {return false;}

	@Override
	public boolean OC() {return true;}
	
	public Papiery()
	{
		super();
		
	}
	//window builder
	
	public Papiery(String numerRejestracyjny, String kolor, double paliwo,double spalanie, double przejechaneKilometry, int rokProdukcji, double predkosc, boolean szyberDach,String prawoJazdy)
	{
		super(numerRejestracyjny, kolor, paliwo,spalanie,przejechaneKilometry,rokProdukcji,predkosc, szyberDach);
		this.prawoJazdy=prawoJazdy;
	}

	public Papiery(String prawoJazdy)
	{
		this.prawoJazdy=prawoJazdy;
	}
	
	public String toString() {
		return "Numer rejestracji:" + numerRejestracyjny + " Kolor samochodu: " + kolor + " Paliwo: " +paliwo+ " Kilometry do przejechania: " + przejechaneKilometry + " Predkosc: " + predkosc + " Samochód posiada szyber dach: "+ szyberDach + " Prawo jazdy: " + prawoJazdy;
	}
}