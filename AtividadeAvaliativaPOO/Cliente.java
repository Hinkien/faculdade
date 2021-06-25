package AAP1;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private ContaCorrente conta;
	
	public Cliente(String nome, int numero) {
		this.nome = nome;
		this.conta = new ContaCorrente(numero);
		this.conta.setCliente(this);
		
	}
	public String getNome() {
		return nome;
	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void opera() {
		Scanner ler = new Scanner(System.in);
		double valorDeposito;
		double valorSaque;
				
		System.out.print("\nCliente " + getNome() + " - Operações \n** Entre com um valor de deposito: ");
		valorDeposito = ler.nextDouble();
		conta.depositaValor(valorDeposito);
		
		System.out.print("** Entre com um valor de saque: ");
		valorSaque = ler.nextDouble();
		conta.retiraValor(valorSaque);
		System.out.println("__________________________");
		
		assert conta.verificaSaldo() > 0 : "Saldo indisponivel!";
	
		//System.out.println("Valor de deposito = $" + valorDeposito);
		//System.out.println("Valor disponivel para saque = $" + valorSaque);
		//System.out.println("Saldo disponivel: $" + conta.verificaSaldo() + "\n");

	}
}
