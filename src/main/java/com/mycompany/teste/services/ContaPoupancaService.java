package com.mycompany.teste.services;

import com.mycompany.teste.interfaces.IContaPoupanca;

/**
 *
 * @author lucas
 */
public class ContaPoupancaService extends ContaBaseService  implements IContaPoupanca{
    private double rendimento = 0;
    
    public ContaPoupancaService(String agencia, String numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void adicionaRendimento() {
        this.rendimento += this.consutaSaldo() * 0.01;
    }

    @Override
    public double consultaRendimento() {
        return this.rendimento;
    }
    
}
