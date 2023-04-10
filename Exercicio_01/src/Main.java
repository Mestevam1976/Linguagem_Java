import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = 2 * (base + altura);
		
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.println("ÁREA = " + String.format("%.4f",area));
		System.out.println("PERÍMETRO = " + String.format("%.4f",perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f",diagonal));
			
		sc.close();
	}	
}