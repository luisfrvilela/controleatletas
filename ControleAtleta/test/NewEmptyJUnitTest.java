

import controleatleta.ControleJogadorDeBasquete;
import controleatleta.JogadorDeBasquete;
import java.util.ArrayList;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;


public class NewEmptyJUnitTest {
    
                ControleJogadorDeBasquete umControle;
                private ArrayList<JogadorDeBasquete> listaJogadoresDeBasquete;
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test 
    public void testAdicionarJogadorDeBasquete(){

    	JogadorDeBasquete umJogador = new JogadorDeBasquete("Michael Jordan");
        assertEquals("Michael Jordan", listaJogadoresDeBasquete.add(umJogador));
        
    }
     
    @Test 
    public void testRemoverJogadorDeBasquete(){

    	JogadorDeBasquete umJogador = new JogadorDeBasquete("Michael Jordan");
        listaJogadoresDeBasquete.add(umJogador);
        assertEquals(null, listaJogadoresDeBasquete.remove(umJogador));
        
    }
}