package lista6;

public class samochodCiezarowy extends Samochod implements Silnik,Trasa {

	
	public double cz=przejechaneKilometry/predkosc;
	String coPrzewozi;

	@Override
	public boolean silnikWlaczony() {return true;}

	
	public int rokProdukcji() {return 2004;}

	@Override
	public String dokad() {return "Warszawa";}

	public samochodCiezarowy()
	{
		super();
		
	}
	
	public samochodCiezarowy(String numerRejestracyjny, String kolor, double paliwo,double spalanie, double przejechaneKilometry, int rokProdukcji, double predkosc, String coPrzewozi)
	{
		super(numerRejestracyjny, kolor, paliwo,spalanie,przejechaneKilometry,rokProdukcji,predkosc);
		this.coPrzewozi=coPrzewozi;
	}
	
public samochodCiezarowy(String coPrzewozi)
{
	this.coPrzewozi=coPrzewozi;
}
}