package lista6;

public class Model extends samochodCiezarowy implements Silnik,Trasa,OCAC,liczKilometry {
	
	
	 
	@Override
	public Double czasTrasy() {
		
		return cz= przejechaneKilometry/predkosc;
	}
	
	String poczatekTrasy;
	String modelCiezarowy;
	
	@Override
	public boolean AC() {return true;}

	@Override
	public boolean OC() {return true;}

	public Model()
	{
		super();
		
	}
	
	public Model(String numerRejestracyjny, String kolor, double paliwo,double spalanie, double przejechaneKilometry, int rokProdukcji, double predkosc, String coPrzewozi, String poczatekTrasy, String modelCiezarowy)
	{
		super(numerRejestracyjny, kolor, paliwo,spalanie,przejechaneKilometry,rokProdukcji,predkosc, coPrzewozi);
		this.poczatekTrasy=poczatekTrasy;
		this.modelCiezarowy=modelCiezarowy;
	}

	public Model(String poczatekTrasy, String modelCiezarowy)
	{
		this.poczatekTrasy=poczatekTrasy;
		this.modelCiezarowy=modelCiezarowy;
		
	}
}