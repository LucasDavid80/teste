
package com.mycompany.teste;

import com.mycompany.teste.controller.ManipulaConta;
import com.mycompany.teste.services.ContaCorrenteService;
import com.mycompany.teste.services.ContaPoupancaService;


public class Main {
    public static void main(String[] args){
        System.out.println("----------Inatel Bank----------");
        
        ManipulaConta Conta = new ManipulaConta();
        
        Conta.menuInicial();
        
        
//        ContaCorrenteService ContaCorrente = new ContaCorrenteService("1111", "12345679-8");
//        ContaPoupancaService ContaPoupanca = new ContaPoupancaService("2222", "98765432-1");
//        
//        System.out.println("----------Conta Corrente----------");
//        ContaCorrente.pagarConta(70.76, "CEMIG");
//        ContaCorrente.depositoConta(300, "PIX");
//        ContaCorrente.adicionarCredito(3000);
//        ContaCorrente.pagarConta(70.76, "Copasa");
//        ContaCorrente.pagarCredito(100);
//        ContaCorrente.consultaExtrato();
//        
//        System.out.println("++++++++++++++++++++++++++++++");
//        
//        System.out.println("----------Conta Poupança----------");
//        ContaPoupanca.depositoConta(5600, "PIX");
//        ContaPoupanca.adicionaRendimento();
//        System.out.println("Rendimento: " + ContaPoupanca.consultaRendimento());
//        ContaPoupanca.adicionaRendimento();
//        System.out.println("Rendimento: " + ContaPoupanca.consultaRendimento());
//        ContaPoupanca.pagarConta(99.90, "Internet");
//        ContaPoupanca.adicionaRendimento();
//        System.out.println("Rendimento: " + ContaPoupanca.consultaRendimento());
//        ContaPoupanca.consultaExtrato();
    }
}
