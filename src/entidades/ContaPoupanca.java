package entidades;

public class ContaPoupanca extends Conta {
	private Double taxaJuros;
	
	public ContaPoupanca () {
		
	}

	public ContaPoupanca(Integer numero, String cliente, Double saldo, Double taxaJuros) {
		super(numero, cliente, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;	
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
	
}
