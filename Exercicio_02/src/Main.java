import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		double media;
		String nome1, nome2;
		
		System.out.println("Dados da Primeira Pessoa: ");
		System.out.println("Nome: ");
		nome1 = sc.nextLine();
		System.out.println("Idade: ");
		idade1 = sc.nextInt();
		System.out.println("Dados da Segunda Pessoa: ");
		System.out.println("Nome: ");
		sc.nextLine(); // ======== LIMPEZA DE BUFFER
		nome2 = sc.nextLine();
		System.out.println("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2) / 2.0;
		
		System.out.println(nome1 + " tem " + idade1 + " anos e " + nome2 + " tem " + idade2 +
				" anos e a média de idade entre eles é de " + String.format("%.1f", media) + 
				" anos");	
		
		sc.close();
	}

}
