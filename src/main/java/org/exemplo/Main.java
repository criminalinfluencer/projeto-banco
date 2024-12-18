package org.exemplo.banco;

import org.exemplo.banco.model.ContaCorrente;
import org.exemplo.banco.model.ContaInvestimento;
import org.exemplo.banco.model.ContaPoupanca;
import org.exemplo.banco.model.ContaSalario;
import org.exemplo.banco.model.TipoCliente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(TipoCliente.PESSOA_FISICA, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(TipoCliente.PESSOA_JURIDICA, 500.0);
        ContaInvestimento contaInvestimento = new ContaInvestimento(TipoCliente.PESSOA_FISICA, 2000.0);
        ContaSalario contaSalario = new ContaSalario(TipoCliente.PESSOA_FISICA, 3000.0, "12.345.678/0001-90");

        contaCorrente.sacar(500.0);
        contaPoupanca.sacar(600.0);
        contaInvestimento.sacar(1000.0);
        contaInvestimento.depositar(200);
        contaInvestimento.sacar(1000.0);
        contaSalario.sacar(1500);
        contaSalario.depositar(500);

        System.out.println("Tarifa de manutenção da conta poupança: " + contaPoupanca.calculaValorTarifaManutencao());
        System.out.println("Tarifa de manutenção da conta investimento: " + contaInvestimento.calculaValorTarifaManutencao());
        System.out.println("Tarifa de manutenção da conta corrente: " + contaCorrente.calculaValorTarifaManutencao());
        System.out.println("Tarifa de manutenção da conta salário: " + contaSalario.calculaValorTarifaManutencao());
    }
}