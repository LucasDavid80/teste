/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.services;

import com.mycompany.teste.interfaces.IContaCorrente;

/**
 *
 * @author lucas
 */
public class ContaCorrenteService extends ContaBaseService implements IContaCorrente {
    private double credito = 0;
    
    public ContaCorrenteService(String agencia, String numeroConta) {
        super(agencia, numeroConta);
    }

    @Override
    public void adicionarCredito(double valor) {
        this.credito+=valor;
    }

    @Override
    public boolean pagarCredito(double valor) {
        if(valor <= 0){
            return false;
        }
        this.pagarConta(valor, "Credito");
        
        this.credito -= valor;
        
        return true;
    }

    @Override
    public double consultaCredito() {
        return this.credito;
    }
    
}
