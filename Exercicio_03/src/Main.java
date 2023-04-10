import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.println("Digite o primeiro número inteiro: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro número inteiro: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			menor = a;			
		} else if (b < a && b < c) {
			menor = b;
		} else {
			menor = c;
		}
		
		System.out.println("O menor número digitado é " + menor);
		
	sc.close();	
	}	
}
