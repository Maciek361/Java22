package lista6;

public class samochodOsobowy extends Samochod implements Silnik, Drzwi
{

	//zmienne
	//int a;
	
	boolean szyberDach;
	public int rokProdukcji() {return 2017;}// glowna 

	@Override
	 public boolean silnikWlaczony() {return true;} //interfejs Silnika

	@Override
	public int iloscDrzwi() {return 4;}

	public samochodOsobowy()
	{
		super();
		
	}
	
	public samochodOsobowy(String numerRejestracyjny, String kolor, double paliwo,double spalanie, double przejechaneKilometry, int rokProdukcji, double predkosc,boolean szyberDach)
	{
		super(numerRejestracyjny, kolor, paliwo,spalanie,przejechaneKilometry,rokProdukcji,predkosc);
		this.szyberDach=szyberDach;
		//this.a=a;
	}
	public samochodOsobowy(boolean szyberDach)
	{
		this.szyberDach=szyberDach;
	}

	

	
	//public int iloscDrzwi() {return 4;}
	
	//public void jazda() {
		// TODO Auto-generated method stub
		
	//}
}