package lista1;

public class Uczen {

	private String imie;
	public  int rok;
	private int ocena;
	public String ulubionyKolor;
	
	
	public Uczen(String imie, int rok, int ocena, String ulubionyKolor)
	{
		this.imie = imie;
		this.rok = rok;
		this.ocena = ocena;
		this.ulubionyKolor = ulubionyKolor;
	}
	
	public String getImie() {
		return imie;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
//	public int getRok() {
//		return rok;
//	}
//	
//	public void setRok() {
//		this.rok = rok;
//	}

	public String getUlubionyKolor() {
		return ulubionyKolor;
	}

	public void setUlubionyKolor(String ulubionyKolor) {
		this.ulubionyKolor = ulubionyKolor;
	}
	
	
}
