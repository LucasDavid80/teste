package com.mycompany.teste;

import com.mycompany.teste.services.ContaCorrenteService;
import com.mycompany.teste.services.ContaPoupancaService;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ContaTest { 
    ContaCorrenteService cc;
    ContaPoupancaService cp;
    
//    @Before
//    public void setup(){
//        cc = new ContaCorrenteService("1234", "12345678-9");
//        cp = new ContaPoupancaService("4321", "98765432-1");
//    }
    
    @Test
    public void ContaCorrentePagarCredito_Ok(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        boolean verifica = cc.pagarCredito(10);
        assertEquals(true, verifica);
    }
    
    @Test
    public void ContaCorrentePagarCredito_Error(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        assertEquals(false, cc.pagarCredito(-10));
    }
    
    @Test
    public void contaPoupancaAdicionaRendimeno(){
        cp = new ContaPoupancaService("4321", "98765432-1");
        cp.depositoConta(5600, "Teste");
        cp.adicionaRendimento();
        assertEquals(56.0, cp.consultaRendimento(), 0);
    }
    
    @Test
    public void contaCorrenteDepositoConta_Ok(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        assertEquals(true, cc.depositoConta(50, "Teste"));
    }
    
    @Test
    public void contaCorrenteDepositoConta_Error(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        assertEquals(false, cc.depositoConta(0, "Teste"));
    }
    
    @Test
    public void contaCorrentePagarConta_Ok(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        cc.depositoConta(100, "PIX");
        assertEquals(true, cc.pagarConta(50, "Teste"));
    }
    
    @Test
    public void contaCorrentePagarConta_Error(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        assertEquals(false, cc.pagarConta(50, "Teste"));
    }
    
    @Test
    public void verificaAgenciaConta(){
        cp = new ContaPoupancaService("4321", "98765432-1");
        assertEquals("4321", cp.getAgencia());
    }
    
    @Test
    public void verificaNumeroConta(){
        cp = new ContaPoupancaService("4321", "98765432-1");
        assertEquals("98765432-1", cp.getNumeroConta());
    }
    
}
