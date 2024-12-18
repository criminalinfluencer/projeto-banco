package org.exemplo.banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(TipoCliente tipoCliente, double saldo) {
        super(TipoConta.POUPANCA, tipoCliente, saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public double calculaValorTarifaManutencao() {
        return 10.0;
    }
}