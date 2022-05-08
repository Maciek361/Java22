package lista6;

public abstract class Samochod {

	public String numerRejestracyjny;
	public String kolor;
	
	public double paliwo;
	public double spalanie;
	public double przejechaneKilometry;
	public double predkosc;
	public abstract int rokProdukcji();
	
	public Samochod ()
	{
		
	}
	
	public Samochod(String numerRejestracyjny, String kolor, double paliwo,double spalanie, double przejechaneKilometry, int rokProdukcji, double predkosc)
	{
		this.numerRejestracyjny= numerRejestracyjny;
		this.kolor= kolor;
		this.paliwo=paliwo;
		this.spalanie=spalanie;
		this.przejechaneKilometry=przejechaneKilometry ;
		this.predkosc=predkosc;
		
	}
	
	public void tankowanie(double paliwo)
	{
		this.paliwo += paliwo;
	}
	public void jazda(double przejechaneKilometry)
	{
		//silnik.jazda(); // jad¹c u¿ywamy silnika (metoda jest pusta, tylko pokazowo
		this.przejechaneKilometry += przejechaneKilometry;
		paliwo -= spalanie* przejechaneKilometry; // zmniejsz sie ilosc paliwa w zaleznosci od spalania
	}
	
	
	
	
	public boolean wTrasie() // klasa Samochod
	{
		return true;
	}


	
} //Glówna: wiekMax= Pies