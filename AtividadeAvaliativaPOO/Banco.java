package AAP1;

import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<Cliente> clientes; 
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<Cliente>();
				
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
		
	}
	
	public static void main(String[] args) {
		Banco vestidoBank = new Banco("Vestido Bank");
		
		Cliente marcia = new Cliente ("Marcia", 123);
		vestidoBank.addCliente(marcia);
		marcia.opera();
		
		Cliente astolfo = new Cliente ("Astolfo", 147);
		vestidoBank.addCliente(astolfo);
		astolfo.opera();
		
		Cliente mario = new Cliente ("Mario", 880);
		vestidoBank.addCliente(mario);
		mario.opera();
		
		for(Cliente cli: vestidoBank.clientes) {
			ContaCorrente conta = cli.getConta();
			conta.imprimeConta();
			
		}
		
		
	}

}
