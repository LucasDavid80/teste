package com.mycompany.teste;

import com.mycompany.teste.controller.ManipulaConta;
import com.mycompany.teste.services.ContaCorrenteService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucas
 */
public class ManipulaContaTest {
    ManipulaConta ManipulaContaFake;
    
    @Test
    public void depositarValorContaCorrenteTest_Ok(){
        ManipulaContaFake = new ManipulaConta();
        
        ContaCorrenteService cc = new ContaCorrenteService("1111", "111111111-0");
        
        String resultado = ManipulaContaFake.depositarValor(cc, 1500, "PIX");
        
        assertEquals("Depósito realizado com sucesso!!", resultado);
    }
    
    @Test
    public void depositarValorContaCorrenteTest_Error(){
        ManipulaContaFake = new ManipulaConta();
        
        ContaCorrenteService cc = new ContaCorrenteService("1111", "111111111-0");
        
        String resultado = ManipulaContaFake.depositarValor(cc, -1500,  "PIX");
        
        assertEquals("Falha ao realizar o Depósito!!", resultado);
    }
    
    @Test
    public void PagamentoContaCorrentTest_ok(){
        ManipulaContaFake = new ManipulaConta();
        
        ContaCorrenteService cc = new ContaCorrenteService("1111", "111111111-0");
        
        ManipulaContaFake.depositarValor(cc, 1500, "teste");
        
        String resultado = ManipulaContaFake.pagamentoConta(cc, 99.90, "Internet");
        
        assertEquals("Pagamento realizado com sucesso!!", resultado);
    }
    
    @Test
    public void PagamentoContaCorreteTest_Error(){
        ManipulaContaFake = new ManipulaConta();
        
        ContaCorrenteService cc = new ContaCorrenteService("1111", "111111111-0");
        
        ManipulaContaFake.depositarValor(cc, 50, "PIX");
        
        String resultado = ManipulaContaFake.pagamentoConta(cc, 99.90, "Internet");
        
        assertEquals("Falha ao realizar o pagamento!!", resultado);
    }
}
