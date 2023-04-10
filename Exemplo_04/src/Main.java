import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		// double y = sc.nextDouble();
		// char z = sc.next().charAt(0);
		// String s = sc.nextLine();
		System.out.println("======== ENTRADA DE DADOS =========");
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite seu nome completo: ");
		sc.nextLine(); // ----------------- LIMPEZA DE BUFFER
		String nome = sc.nextLine();
		System.out.println("========= SAÍDA DE DADOS ==========");
		System.out.println("Sua idade é de " + idade + " anos.");
		System.out.println("Seu nome é " + nome);
		
		
		sc.close();
	}

}
