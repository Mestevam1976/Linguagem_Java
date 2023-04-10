import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, ordem, soma;
		
		System.out.println("Digite dois números inteiros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			ordem = x;
			x = y;
			y = ordem;
		}
		
		soma = 0;
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("A soma dos ímpares é igual a " + soma);
		
		sc.close();

	}

}
