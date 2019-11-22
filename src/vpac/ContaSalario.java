package vpac;

public class ContaSalario extends Conta {

	@Override
	public void sacar(double valorSaque) {
		taxa = 0;
		if (valorSaque <= 0) {
			System.out.println("Valor Saque indisponivel");
		} else {
			if (getContadorSaque() > 1) {

				taxa = 50;
				super.sacar(valorSaque + taxa);
			} else {
				taxa = 0;
				super.sacar(valorSaque + taxa);
			}

		}
	}
}
