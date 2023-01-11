package com.mycompany.teste.services;

import com.mycompany.teste.interfaces.IContaService;
import com.mycompany.teste.model.Pagamentos;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public abstract class ContaBaseService implements IContaService{
    private String agencia;
    private String numeroConta;
    private double saldo = 0;
    
    ArrayList<Pagamentos> extrato = new ArrayList<Pagamentos>();

    public ContaBaseService(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    @Override
    public boolean pagarConta(double valor, String nome) {
        if(this.saldo < valor){
            return false;
        }
        this.saldo -= valor;
        
        Pagamentos Pagamento = new Pagamentos(-valor, nome, "Pagamento");
        
        extrato.add(Pagamento);
        
        return true;
    }

    @Override
    public boolean depositoConta(double valor, String nome) {
        if(valor <= 0){
            return false;
        }
        this.saldo += valor;
        
        extrato.add(new Pagamentos(valor, nome, "Deposito"));
        
        return true;
    }

    @Override
    public double consutaSaldo() {
        return this.saldo;
    }

    @Override
    public void consultaExtrato() {
        for (Pagamentos pagamento: this.extrato){
            System.out.println("Nome: " + pagamento.getNome());
            System.out.println("Valor: " + pagamento.getValor());
            System.out.println("Operação: " + pagamento.getOperacao());
            System.out.println("----------------------------------");
        }
        System.out.println("Saldo Total: "+this.saldo);
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    
}
