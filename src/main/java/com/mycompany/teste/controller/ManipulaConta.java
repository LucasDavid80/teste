package com.mycompany.teste.controller;

import com.mycompany.teste.services.ContaBaseService;
import com.mycompany.teste.services.ContaCorrenteService;
import com.mycompany.teste.services.ContaPoupancaService;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ManipulaConta {
    ContaBaseService ContaCorrente;
    ContaBaseService ContaPoupanca;
    
    public void menuInicial(){
        System.out.println(" Selecione seu tipo de conta: \n");
        System.out.println(" (1) -> Conta Corrente ");
        System.out.println(" (2) -> Conta Poupança ");
        System.out.println(" Escolha uma opção: ");
        
        Scanner teclado = new Scanner(System.in);
        
        short op = teclado.nextShort();
        
        teclado.nextLine();
        
        System.out.println("Entre com a agência: ");
        String agencia = teclado.nextLine();
        
        System.out.println("Entre com o número da conta: ");
        String conta = teclado.nextLine();
        
        System.out.println("-------------------------------------");
        
        switch(op){
            case 1:
                ContaCorrente = new ContaCorrenteService(agencia, conta);
                this.menuConta(ContaCorrente);
                break;
            case 2:
                ContaPoupanca = new ContaPoupancaService(agencia, conta);
                this.menuConta(ContaPoupanca);
                break;
        }
    }
    
    public void menuConta(ContaBaseService conta){
        short op = 0;
        while (op != 3) {            
            System.out.println(" Conta: ");
            System.out.println(" (1) -> Depositar dinheiro em conta ");
            System.out.println(" (2) -> Pagar Conta ");
            System.out.println(" (3) -> Sair ");
            System.out.println(" Escolha uma opção: ");
            
            Scanner teclado = new Scanner(System.in);
            
            op = teclado.nextShort();
            
            teclado.nextLine();
            
            switch(op){
                    case 1:
                        System.out.println(" Entre com o nome do depósito: ");
                        String nomeDeposito = teclado.nextLine();
                        
                        System.out.println(" Entre com o valor do depósito: ");
                        double valorDeposito =  teclado.nextDouble();
                        
                        teclado.nextLine();
                        
                        //metodo depósito valor
                        System.out.println(this.depositarValor(conta, valorDeposito, nomeDeposito));
                        
                        break;
                    case 2:
                        System.out.println(" Entre com o nome do pagamento: ");
                        String nomePagamento = teclado.nextLine();
                        
                        System.out.println(" Entre com o valor do pagamento: ");
                        double valorPagamento = teclado.nextDouble();
                        
                        teclado.nextLine();
                        
                        // método pagamento valor
                        System.out.println(this.pagamentoConta(conta, valorPagamento, nomePagamento));
                        
                        break;
                    case 3:
                        System.out.println(" Fim da operação!! ");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
            }
        }
    }
    
    public String depositarValor(ContaBaseService Conta, double valor, String nome){
        boolean resposta = Conta.depositoConta(valor, nome);
        
        if(!resposta){
            return "Falha ao realizar o Depósito!!";
        }
        
        return "Depósito realizado com sucesso!!";
    }
    
    public String pagamentoConta(ContaBaseService Conta, double valor, String nome){
        boolean resposta = Conta.pagarConta(valor, nome);
        
        if(!resposta){
            return "Falha ao realizar o pagamento!!";
        }
        
        return "Pagamento realizado com sucesso!!";
    }
}
