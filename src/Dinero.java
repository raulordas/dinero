import java.util.Scanner;

public class Dinero {

	public static void main(String[] args) {
		int billetes= 0;
		int resto=0;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Mete la cantidad");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		while (cantidad>0) {
			//Si la cantidad es mayor que 100, calcula en número de billetes de 100 necesarios
			if (cantidad > 100) {
				billetes = cantidad/100;
				resto = cantidad%100;
				System.out.println("Son " + billetes + " de 100 �");
				cantidad = resto;
			
			} else if (cantidad >= 50) {
				billetes = resto/50;
				resto = cantidad%50;
				System.out.println("Son " + billetes + " de 50 �");
				cantidad = resto;
				
			} else if (cantidad >= 20) {
				billetes = resto/20;
				resto = resto%20;
				System.out.println("Son " + billetes + " de 20 �");
				cantidad = resto;
			
			} else if (resto >= 10) {
				billetes = resto/10;
				resto = resto%10;
				System.out.println("Son " + billetes + " de 10 �");
				cantidad = resto;
			} else {
				System.out.println("y " + cantidad + " � sueltos en monedas");
				cantidad = 0;
		sc.close();
			}
		}
	}
}
