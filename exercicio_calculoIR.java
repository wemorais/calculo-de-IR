import java.util.Locale;
import java.util.Scanner;

public class exercicio_calculoIR {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario para calculo de IR devido: ");
		
			double salario = sc.nextDouble();
		
			double imposto;
			
			if (salario <= 2000.0) {
				imposto = 0.0;
			}
		
			else if (salario <= 3000.0) {
				imposto = (salario - 2000.0) * 0.08;
			}
		
			else if (salario <= 4500.0) {
				imposto = (salario - 3000.0)* 0.18 + 1000.0 * 0.08;
			}
		
			else {
				imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			}
		
			if (imposto == 0.0)		{
			System.out.println("Isento");
			}
		
			else {
			System.out.printf("O valor de imposto a pagar é R$ %.2f%n", imposto);
			}
		
		sc.close();
	}

}
