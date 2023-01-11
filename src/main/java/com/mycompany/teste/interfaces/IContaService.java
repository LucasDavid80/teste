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
public interface IContaService {
    public boolean pagarConta(double valor, String nome);
    public boolean depositoConta(double valor, String nome);
    public double consutaSaldo();
    public void consultaExtrato();
}
