import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bom dia"); // Pula linha
		System.out.print("Boa noite - "); //Não pula linha
		System.out.println("Olá mundo!");

		Locale.setDefault(Locale.US);
		double x;
		x = 2.3456;
		System.out.println(String.format("%.2f",x));
		
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 32;
		salario = 4560.90;
		nome = "Maria Silva";
		sexo = 'F';
		
		System.out.println("A funcionária " + nome + ", sexo " + sexo + ", ganha R$ "
				+ String.format("%.2f",salario) + " e tem " + idade + " anos.");
	}

}
