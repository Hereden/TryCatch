
public class Principal {
	static int numerador=10;
	static int denominador=0;
	static float division;
	
	public static void main(String[] args) {
		System.out.println("Antes de la división");
		try {
			division= numerador / denominador;
		}catch(ArithmeticException ex) {
			division=0;
			System.out.println("Error: "+ ex.getMessage());
		}catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		System.out.println("Después de la división");

	}

}
