package lista6;

public interface OCAC {
	
	boolean AC();
	boolean OC();
	
	public default void cechaPapiery() {
		System.out.println("Ka�dy w�a�ciciel posiada OC, lecz nie ka�dy w�a�ciciel posiada AC");
	}
	

}
