package vpac;

public class Conta {
	public String agencia;
	public String numeroConta;
	public String nomeTitular;
	private double saldo;
	private int contadorSaque = 1;
	double taxa;
	private double valorTributos;

	public void depositar(double valorDeposito) {
		this.saldo = valorDeposito + this.saldo;
	}

	public void sacar(double valorSaque) {
		if (valorSaque > this.saldo) {
			System.out.println("Valor Saque indisponivel");
		} else {

			setValorTributos(taxa);
			this.saldo = this.saldo - valorSaque;
			AddContadorSaque();
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	private void AddContadorSaque() {
		this.contadorSaque = this.contadorSaque + 1;
	}

	protected int getContadorSaque() {
		return this.contadorSaque;
	}

	private void setValorTributos(double taxa) {
		this.valorTributos = this.valorTributos + taxa;

	}

	protected double getValorTributos() {
		return this.valorTributos;
	}

}
