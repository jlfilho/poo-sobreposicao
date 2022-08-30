 package entidades;

public abstract class Conta {
	private Integer numero;
	private String cliente;
	protected Double saldo;
	
	public Conta() {
	
	}
	
	public Conta(Integer numero, String cliente, Double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}

	
	

}
