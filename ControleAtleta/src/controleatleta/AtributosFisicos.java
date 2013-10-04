
package controleatleta;


public class AtributosFisicos {
    
    
    private Double envergadura;
    private Double impulso; //porcentagem da altura do impulso em relacao a uma altura de 2 metros
    private String resistencia;//Excelente, Otima, Regular, Ruim, Pessima
    private Double tempoDeReacao;//tempo em segundos
    private Double aceleracao;//aceleracao do atleta na hora do "pique"
    private String historicoDeLesao;//Lesionado anteriormente, Nao lesionado

    public Double getEnvergadura() {
        return envergadura;
    }

    
    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    
    public Double getImpulso() {
        return impulso*100;//retorno em  cm 
    }

    public void setImpulso(Double impulso) {
        this.impulso = ((impulso/100) * 2);
    }


    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Double getTempoDeReacao() {
        return tempoDeReacao;
    }

   
    public void setTempoDeReacao(Double tempoDeReacao) {
        this.tempoDeReacao = tempoDeReacao;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    
    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

   
    public String getHistoricoDeLesao() {
        return historicoDeLesao;
    }

    public void setHistoricoDeLesao(String historicoDeLesao) {
        this.historicoDeLesao = historicoDeLesao;
    }
    
}
