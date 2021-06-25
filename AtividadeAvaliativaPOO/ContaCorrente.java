package AAP1;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public ContaCorrente(int numero) {
		this.numero = numero;
		
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}
	public void depositaValor(double deposito) {
		saldo = saldo + deposito;
		
	}
	public void retiraValor(double saque) {	
		saldo = saldo - saque;
		
	}
	public double verificaSaldo() {
		return saldo;
		
	}
	public void imprimeConta() {
		System.out.println("\nNumero da Conta: " + cliente.getConta().numero);
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Saldo total: R$" + verificaSaldo());
		
	}
	
	
}
