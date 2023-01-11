/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.interfaces;

/**
 *
 * @author lucas
 */
public interface IContaCorrente {
    public void adicionarCredito(double valor);
    public boolean pagarCredito(double valor);
    public double consultaCredito();
}
