package lista6;

public class Zadanie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	samochodOsobowy osobowy = new samochodOsobowy();
		Papiery osobowy= new Papiery("OP 4215","zielony",12,6,14,15,20,true,"Kierowca posiada prawo jazdy od 3 lat");
		
		System.out.println("Samochod osobowy: ");
		osobowy.tankowanie(60);// tankujemy 50 litrow paliwa
		osobowy.jazda(5);// jedziemy 5 kilometrow
		
		System.out.print("W baku zostanie jeszcze : "+osobowy.paliwo+ " l paliwa\n" );
		System.out.println("Ilo�� drzwi: "+ osobowy.iloscDrzwi());
		osobowy.cechaDrzwi();
		System.out.println("Silnik w��czony" +osobowy.silnikWlaczony());
		System.out.println("OC:"+ osobowy.OC());
		System.out.println("AC:"+ osobowy.AC());

		System.out.println(osobowy+"\n");
		//System.out.println("\n"+osobowy.toString());
		
		
		Model ciezarowy= new Model("OP 12345","czarny", 4,5,6,7,8, "Meble", "Opole","Scania");
		System.out.println("Samochod ciezarowy: ");
		ciezarowy.tankowanie(1000);
		ciezarowy.jazda(220);
		ciezarowy.przejechaneKilometry=200;
		ciezarowy.predkosc=50;
		//ciezarowy.predkosc(200);
		System.out.print(("W baku zostanie jeszcze : "+ciezarowy.paliwo + " l paliwa \n"));
		ciezarowy.zadanie();
		System.out.println("Miejsce docelowe: "+ ciezarowy.dokad());
		System.out.println("Silnik w��czony: "+ ciezarowy.silnikWlaczony());
		System.out.println("OC:"+ ciezarowy.OC());
		System.out.println("AC:"+ ciezarowy.AC());
		System.out.print("Do celu zosta�o: "+ ciezarowy.czasTrasy() +" h");

	//	System.out.println(ciezarowy.czasTrasy());
		
	//	System.out.println(osobowy.toString());
		System.out.println("\n"+ciezarowy);
		
		
	}

}