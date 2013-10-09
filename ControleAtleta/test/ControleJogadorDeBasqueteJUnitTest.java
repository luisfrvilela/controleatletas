
import controleatleta.ControleJogadorDeBasquete;
import controleatleta.JogadorDeBasquete;
import java.util.ArrayList;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;


public class ControleJogadorDeBasqueteJUnitTest {
    
    private ArrayList<JogadorDeBasquete> listaJogadoresDeBasquete;
    private JogadorDeBasquete umJogadorDeBasquete;
    private ControleJogadorDeBasquete umControle;
    
    @Before
    public void setUp() throws Exception {
        
        umJogadorDeBasquete = new JogadorDeBasquete("Michael Jordan");
        umControle = new ControleJogadorDeBasquete();
        
    }
    
    @Test
    public void testgetListaJogadoresDeBasquete(){
       
        assertNotNull(umControle.getListaJogadoresDeBasquete());
    
    }
    
    @Test 
    public void testAdicionarJogadorDeBasquete(){
        
        umControle.adicionar(umJogadorDeBasquete);
        assertNotNull(umControle.getListaJogadoresDeBasquete());
        
    }
     
    @Test 
    public void testPesquisarJogadorDeBasquete(){
        
        umControle.adicionar(umJogadorDeBasquete);
        assertEquals(umJogadorDeBasquete, umControle.pesquisar("Michael Jordan"));
        assertNotNull(umControle.pesquisar("Michael Jordan"));
    
    }
    
    @Test 
    public void testRemoverJogadorDeBasquete(){
        
        umControle.adicionar(umJogadorDeBasquete);
        umControle.remover(umJogadorDeBasquete);
    	assertNull(umControle.pesquisar("Michael Jordan"));
    
    }
}