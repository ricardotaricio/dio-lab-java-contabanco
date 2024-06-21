package dio.java.lab.contabanco;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o número da agência: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Informe o número da conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Informe o nome do cliente: ");
		scanner.nextLine();
		String cliente = scanner.nextLine();
		
		System.out.println("Informe o saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", cliente, agencia, conta, saldo);
		
		scanner.close();
	}
}
