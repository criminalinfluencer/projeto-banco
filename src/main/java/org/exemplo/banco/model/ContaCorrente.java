package org.exemplo.banco.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(TipoCliente tipoCliente, double saldo) {
        super(TipoConta.CORRENTE, tipoCliente, saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public double calculaValorTarifaManutencao() {
        return 0;
    }
}