package org.exemplo.banco.model;

public class ContaSalario extends Conta {

    private String cnpjEmpresa;

    public ContaSalario(TipoCliente tipoCliente, double saldo, String cnpjEmpresa) {
        super(TipoConta.SALARIO, tipoCliente, saldo);
        this.cnpjEmpresa = cnpjEmpresa;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public double calculaValorTarifaManutencao() {
        return 0;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}