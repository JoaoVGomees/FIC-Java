import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner xaxa = new Scanner (System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		
		System.out.println("Digite o número da conta: ");
		numero = xaxa.nextInt();
		xaxa.nextLine();
		
		System.out.println("Digite a agencia: ");
		agencia = xaxa.nextLine();
		
		System.out.println("");
		
		System.out.println("Digite o saldo da conta: ");
		saldo = xaxa.nextFloat();
		xaxa.nextLine();

		System.out.println("Digite o nome do cliente: ");
		nomeCliente = xaxa.nextLine();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
		
		
	}

}
