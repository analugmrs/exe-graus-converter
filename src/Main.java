import java.util.Scanner; 
	
public class Main {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		char resp = 's';
		
		do {
			System.out.println("Digite a temperatura em graus celsius: ");
			int C = sc.nextInt();
			double conversion = 9.0 * C / 5.0 + 32;
			System.out.println("A conversão em Farenheit é: " + conversion);
			System.out.println("Deseja repetir?" );
			resp = sc.next().charAt(0);

		} while (resp != 'n');
		
		sc.close();

	}

}
