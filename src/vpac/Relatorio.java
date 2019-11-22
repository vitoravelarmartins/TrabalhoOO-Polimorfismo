package vpac;

import java.util.ArrayList;

public class Relatorio {
	
	public ArrayList<Conta> listaContas = new ArrayList<>();

	public void relatorio (Conta conta) {
		System.out.println(conta.getValorTributos());
	}
	
	public void totalTributos() {
		double tributos;
		double saldo = 0;
		for (Conta conta : listaContas) {
			 tributos = conta.getValorTributos();
			 saldo = tributos+saldo;
			

			}
		System.out.println("Total Arrecadado pelo Banco: "+ saldo+" Reais");
	}
}
