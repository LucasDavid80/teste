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
    
    @Before
    public void setup(){
        cc = new ContaCorrenteService("1234", "12345678-9");
        cp = new ContaPoupancaService("4321", "98765432-1");
    }
    
    @Test
    public void ContaCorrentePagarCredito_Ok(){
        boolean verifica = cc.pagarCredito(10);
        assertEquals(true, verifica);
    }
    
    @Test
    public void ContaCorrentePagarCredito_Error(){
        assertEquals(false, cc.pagarCredito(-10));
    }
    
    @Test
    public void contaPoupancaAdicionaRendimeno(){
        cp.depositoConta(5600, "Teste");
        cp.adicionaRendimento();
        assertEquals(56.0, cp.consultaRendimento(), 0);
    }
    
}
