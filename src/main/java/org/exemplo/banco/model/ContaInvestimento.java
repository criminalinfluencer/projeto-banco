package org.exemplo.banco.model;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(TipoCliente tipoCliente, double saldo) {
        super(TipoConta.INVESTIMENTO, tipoCliente, saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public double calculaValorTarifaManutencao() {
        return 20.0;
    }
}