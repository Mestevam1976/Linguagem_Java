
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
 Scanner sc = new Scanner(System.in);
 int hora;
 System.out.print("Digite uma hora do dia: ");
 hora = sc.nextInt();
 if (hora >= 5 && hora < 12) {
 System.out.println("Bom dia!");
 }
 else if (hora >= 12 && hora < 18) {
 System.out.println("Boa tarde!");
 }
 else {
	 System.out.println("Boa noite!");
 }
 
 sc.close();
 
 }

} 