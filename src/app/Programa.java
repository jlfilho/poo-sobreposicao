package app;

import java.util.ArrayList;
import java.util.List;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		/*
		 * Conta conta1 = new Conta(1001, "Alex", 1000.0); // erro ao instanciar classe
		 * abstrata Conta conta2 = new ContaPoupanca(1001, "Alex", 1000.0, 0.01); Conta
		 * conta3 = new ContaEmpresarial(1001, "Alex", 1000.0, 500.00);
		 */

		List<Conta> list = new ArrayList<>();

		list.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
		list.add(new ContaEmpresarial(1002, "Maria", 1000.0, 400.00));
		list.add(new ContaPoupanca(1003, "Bob", 300.0, 0.01));
		list.add(new ContaEmpresarial(1004, "Anna", 500.0, 500.00));
		
		double soma=0.0;
		for (Conta c: list) {
			soma += c.getSaldo();
		}
		
		System.out.printf("Saldo total: %.2f", soma);
		
		for (Conta c: list) {
			c.deposito(10.0);
		}
		System.out.println();
		for (Conta c: list) {
			System.out.println(c.getCliente() + " = R$ " + c.getSaldo());
		}

	}

}
