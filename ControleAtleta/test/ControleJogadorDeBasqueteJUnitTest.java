
import controleatleta.JogadorDeBasquete;
import java.util.ArrayList;


import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;


public class ControleJogadorDeBasqueteJUnitTest {
    
                
                private ArrayList<JogadorDeBasquete> listaJogadoresDeBasquete;
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test 
    public void testAdicionarJogadorDeBasquete(){

    	JogadorDeBasquete umJogador = new JogadorDeBasquete("Michael Jordan");
        listaJogadoresDeBasquete.add(umJogador);
        assertEquals(umJogador.getNome() , "Michael Jordan");
        
    }
     
    @Test 
    public void testRemoverJogadorDeBasquete(){

    	JogadorDeBasquete umJogador = new JogadorDeBasquete("Michael Jordan");
        listaJogadoresDeBasquete.add(umJogador);
        listaJogadoresDeBasquete.remove(umJogador);
        assertEquals(null, umJogador.getNome());
        
    }
}