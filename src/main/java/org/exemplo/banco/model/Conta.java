package org.exemplo.banco.model;

import java.time.LocalDate;

public abstract class Conta {
    protected TipoConta tipoConta;
    protected TipoCliente tipoCliente;
    protected LocalDate dataAbertura;
    protected double saldo;

    public Conta(TipoConta tipoConta, TipoCliente tipoCliente, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = LocalDate.now();
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}