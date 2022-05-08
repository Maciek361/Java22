package lista6;

public interface Silnik {

	boolean silnikWlaczony();
	default void stanSilnika(){
		System.out.println("Silnik nie jest uszkodzony");
		}
	
}