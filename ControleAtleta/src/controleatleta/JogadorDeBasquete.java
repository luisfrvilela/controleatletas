package controleatleta;

import java.util.ArrayList;

public class JogadorDeBasquete extends Atleta {

    private AtributosFisicos atributosFisicos; 
    private AtributosMentais atributosMentais;
    private AtributosTecnicos atributosTecnicos;
    private ArrayList<Premiacao> premiacoes;
    private String apelido; 
    private String posicao; //armador, ala, pivo, ala-armador, ala-pivo
    private int numeroDaCamisa;
   private String maoDominante; //Esquerda, Direita

    public JogadorDeBasquete(String nome) {
        super(nome);
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }


    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(int numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

   
    public AtributosFisicos getAtributosFisicos() {
        return atributosFisicos;
    }

    public void setAtributosFisicos(AtributosFisicos atributosFisicos) {
        this.atributosFisicos = atributosFisicos;
    }

    public AtributosMentais getAtributosMentais() {
        return atributosMentais;
    }

  
    public void setAtributosMentais(AtributosMentais atributosMentais) {
        this.atributosMentais = atributosMentais;
    }

   
    public AtributosTecnicos getAtributosTecnicos() {
        return atributosTecnicos;
    }

   
    public void setAtributosTecnicos(AtributosTecnicos atributosTecnicos) {
        this.atributosTecnicos = atributosTecnicos;
    }

    public String getPosicao() {
        return posicao;
    }

   
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getMaoDominante() {
        return maoDominante;
    }

    public void setMaoDominante(String maoDominante) {
        this.maoDominante = maoDominante;
    }

}