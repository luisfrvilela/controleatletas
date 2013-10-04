package controleatleta;

import java.util.ArrayList;

public class ControleJogadorDeBasquete {

    private ArrayList<JogadorDeBasquete> listaJogadoresDeBasquete;

    public ControleJogadorDeBasquete() {
        this.listaJogadoresDeBasquete = new ArrayList<JogadorDeBasquete>();
    }
    
    public ArrayList<JogadorDeBasquete> getListaJogadoresDeBasquete() {
        return listaJogadoresDeBasquete;
    }
    
    public void adicionar(JogadorDeBasquete umJogadorDeBasquete) {
        listaJogadoresDeBasquete.add(umJogadorDeBasquete);
    }
    
    public void remover(JogadorDeBasquete umJogadorDeBasquete) {
        listaJogadoresDeBasquete.remove(umJogadorDeBasquete);
    }
    
    public JogadorDeBasquete pesquisar(String nome) {
        for (JogadorDeBasquete i: listaJogadoresDeBasquete) {
            if (i.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return null;
    }
}
