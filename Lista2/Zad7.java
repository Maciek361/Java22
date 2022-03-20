package lista2_7;

public class Zad7 {

	
	static int a = 25;
    static int k = 3;
    static int wynik;


    public static void main(String[] args) {
    	
        wynik = a ^(1<<k);
        System.out.println(Integer.toBinaryString(25));
        System.out.println(Integer.toBinaryString(wynik));
        
    }
}
