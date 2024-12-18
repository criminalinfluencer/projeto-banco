package org.exemplo.banco.aspect;

import org.exemplo.banco.model.Conta;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificacaoSaldoAspect {

    @Pointcut("execution(* org.exemplo.banco.model.Conta.sacar(..)) && args(valor)")
    public void sacarPointcut(double valor) {}

    @Around("sacarPointcut(valor)")
    public void verificaSaldoAntesDeSacar(ProceedingJoinPoint joinPoint, double valor) throws Throwable {
        Conta conta = (Conta) joinPoint.getTarget();
        if (conta.getSaldo() >= valor) {
            joinPoint.proceed();
        } else {
            System.err.println("ERRO: Saldo insuficiente para saque na conta " + conta.getTipoConta() +
                    ". Saldo atual: R$" + conta.getSaldo() + ", Valor solicitado: R$" + valor);
        }
    }
}