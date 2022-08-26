package entidades;

public class ContaEmpresarial extends Conta {
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String cliente, Double saldo, Double limiteEmprestimo) {
		super(numero, cliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10; //taxa de 10 reais, usar protected
		}
	}
	
	
	
	
	
	
	
	

}
