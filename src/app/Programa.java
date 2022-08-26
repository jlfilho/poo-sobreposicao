package app;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta(1001, "Alex", 1000.0);
		conta.saque(200.00);
		System.out.println(conta.getSaldo());
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(1002, "Maria", 1000.00, 0.01);
		contaPoupanca.saque(200.00);
		System.out.println(contaPoupanca.getSaldo());
		
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1003, "Bob", 1000.00, 500.0);
		contaEmpresarial.saque(200.00);
		System.out.println(contaEmpresarial.getSaldo());
	}
	
	

}
