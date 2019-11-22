package user;

import vpac.ContaCorrente;
import vpac.ContaPoupanca;
import vpac.ContaSalario;
import vpac.Relatorio;

public class Software {
	public static void main(String[] args) {

// Criando Conta Corrente

		ContaCorrente cc = new ContaCorrente();
		cc.agencia = "123";
		cc.numeroConta = "234";
		cc.nomeTitular = "cc";

		cc.depositar(100);
		cc.sacar(1);
		System.out.println("Saldo conta Corrente: " + cc.getSaldo());

//Criando Conta Poupanca
		ContaPoupanca cp = new ContaPoupanca();
		cp.agencia = "123";
		cp.numeroConta = "4554";
		cp.nomeTitular = "cp";

		cp.depositar(100);
		cp.sacar(1);
		System.out.println("Saldo conta Poupaça: " + cp.getSaldo());
		
//Criando Conta Salario		
		ContaSalario cs = new ContaSalario();
		cs.agencia = "222";
		cs.numeroConta = "111";
		cs.nomeTitular = "cs";

		cs.depositar(100);
		cs.sacar(10);
		cs.sacar(10);
		System.out.println("Saldo conta Salario: " + cs.getSaldo());
		
//Criando Relatorio
		Relatorio relatorio = new Relatorio();
		relatorio.listaContas.add(cc);
		relatorio.listaContas.add(cp);
		relatorio.listaContas.add(cs);

		relatorio.totalTributos();

	}

}
