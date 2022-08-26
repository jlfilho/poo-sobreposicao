package app;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta(1001, "Alex", 0.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		Conta conta1 = contaEmpresarial;
		Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 500.0);
		Conta conta3 = new ContaPoupanca(1004, "Bob", 0.0, 0.01);
		
		//Downcasting
		//ContaEmpresarial contaEmpresarial2 = conta2; //Não aceita downcasting naturalmente
		ContaEmpresarial contaEmpresarial2 = (ContaEmpresarial)conta2;  //Aceita downcasting explicito
		contaEmpresarial2.emprestimo(100.00); //Pode fazer uso dos métodos da subclasse
		
		//ContaEmpresarial contaEmpresarial3 = (ContaEmpresarial)conta3; //Erro em tempo de execução, classes não são herança
		
		if (conta3 instanceof ContaEmpresarial) {
			ContaEmpresarial contaEmpresarial3 = (ContaEmpresarial)conta3;
			contaEmpresarial3.emprestimo(200.00);
			System.out.println("Emprestimo realizado!");
		}
		
		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca contaPoupanca1 = (ContaPoupanca)conta3;
			contaPoupanca1.atualizarSaldo();
			System.out.println("Saldo atualizado!");
		}
		
	}
	
	

}
