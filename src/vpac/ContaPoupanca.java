package vpac;

public class ContaPoupanca extends Conta {

	@Override
	public void sacar(double valorSaque) {
		taxa = 0;
		if (valorSaque <= 0) {
			System.out.println("Valor Saque indisponivel");
		} else {
			if (getContadorSaque() <= 3) {
				taxa = 12;
				super.sacar(valorSaque + taxa);

			} else {
				taxa = 20;
				super.sacar(valorSaque + taxa);
			}

		}
	}
}
