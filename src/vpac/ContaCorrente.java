package vpac;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valorSaque) {
		taxa = 0;
		if (valorSaque <= 0 ) {
			System.out.println("Valor Saque indisponivel");
		} else {
			if (getContadorSaque() <= 5) {
				taxa = 28;
				super.sacar(valorSaque + taxa);

			} else if ((getContadorSaque() <= 10)) {
				taxa = 45;
				super.sacar(valorSaque + taxa);

			} else {
				taxa = 60;
				super.sacar(valorSaque + taxa);

			}

		}

	}
}
