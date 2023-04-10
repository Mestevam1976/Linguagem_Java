import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a, b, x, y;
		double resultado1, resultado2, z;
		
		a = 5;
		b = 2;
		x = 5;
		y = 2 * x;
		z = 2 * x;
		resultado1 = a/b;
		resultado2 = (double) a/b;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(resultado1); // Sem Casting
		System.out.println(resultado2); // Com Casting

	}

}
