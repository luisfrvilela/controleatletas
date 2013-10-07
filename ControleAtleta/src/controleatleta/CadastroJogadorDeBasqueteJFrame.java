
package controleatleta;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CadastroJogadorDeBasqueteJFrame extends javax.swing.JFrame {

    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private ControleJogadorDeBasquete controleJogadorDeBasquete;
    private JogadorDeBasquete umJogadorDeBasquete;
    private boolean modoAlteracao;
    private boolean novoRegistro;
    private DefaultListModel telefonesListModel;
    private DefaultListModel premiacaoListModel;
    
    public CadastroJogadorDeBasqueteJFrame() {
        initComponents();
        this.habilitarDesabilitarCampos();
        this.controleJogadorDeBasquete = new ControleJogadorDeBasquete();
        this.telefonesListModel = new DefaultListModel();
        this.jListTelefones.setModel(telefonesListModel);
        this.premiacaoListModel = new DefaultListModel();
        this.jListPremiacoes.setModel(premiacaoListModel);
        this.jTableListaJogadoresDeBasquete.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
   

    private void limparCampos() {
        
        jComboBoxValorArremessoComBase.setSelectedIndex(0);
        jComboBoxValorArremessoComGancho.setSelectedIndex(0);
        jComboBoxValorArremessoGarrafao.setSelectedIndex(0);
        jComboBoxValorArremessoLongo.setSelectedIndex(0);
        jComboBoxValorArremessoMedio.setSelectedIndex(0);
        jComboBoxValorArremessoTresPontos.setSelectedIndex(0);
        jComboBoxValorAtitudeDeEquipe.setSelectedIndex(0);
        jComboBoxValorBandeja.setSelectedIndex(0);
        jComboBoxValorBloqueio.setSelectedIndex(0);
        jComboBoxValorCompetitividade.setSelectedIndex(0);
        jComboBoxValorDesarme.setSelectedIndex(0);
        jComboBoxValorDominioDaBola.setSelectedIndex(0);
        jComboBoxValorDrible.setSelectedIndex(0);
        jComboBoxValorEnterrada.setSelectedIndex(0);
        jComboBoxValorEstado.setSelectedIndex(0);
        jComboBoxValorHistoricoDeLesao.setSelectedIndex(0);
        jComboBoxValorImpactoPressao.setSelectedIndex(0);
        jComboBoxValorLanceLivre.setSelectedIndex(0);
        jComboBoxValorLideranca.setSelectedIndex(0);
        jComboBoxValorMaoDominante.setSelectedIndex(0);
        jComboBoxValorPassePeito.setSelectedIndex(0);
        jComboBoxValorPasseQuicado.setSelectedIndex(0);
        jComboBoxValorPosicao.setSelectedIndex(0);
        jComboBoxValorReboteDefensivo.setSelectedIndex(0);
        jComboBoxValorReboteOfensivo.setSelectedIndex(0);
        jComboBoxValorResistencia.setSelectedIndex(0);
        jComboBoxValorSensoDeQuadra.setSelectedIndex(0);
        jComboBoxValorSexo.setSelectedIndex(0);
        
        jTextFieldValorAceleracao.setText("0.0");
        jTextFieldValorAltura.setText("0.0");
        jTextFieldValorApelido.setText(null);
        jTextFieldValorBairro.setText(null);
        jTextFieldValorCep.setText(null);
        jTextFieldValorCidade.setText(null);
        jTextFieldValorComplemento.setText(null);
        jTextFieldValorCpf.setText(null);
        jTextFieldValorDataDeNascimento.setText(null);
        jTextFieldValorEnvergadura.setText("0.0");
        jTextFieldValorImpulso.setText("0.0");
        jTextFieldValorLogradouro.setText(null);
        jTextFieldValorNome.setText(null);
        jTextFieldValorNomeDaMae.setText(null);
        jTextFieldValorNomeDoPai.setText(null);
        jTextFieldValorNumero.setText(null);
        jTextFieldValorNumeroDaCamisa.setText(null);
        jTextFieldValorPais.setText(null);
        jTextFieldValorPeso.setText("0.0");
        jTextFieldValorRg.setText(null);
        jTextFieldValorTempoDeReacao.setText("0.0");
 
        telefonesListModel.clear();
        premiacaoListModel.clear();
 
    }
    
     
     private void habilitarDesabilitarCampos() {
        
         boolean registroSelecionado = (umJogadorDeBasquete != null);
        
        jTextFieldValorAceleracao.setEnabled(modoAlteracao);      
        jTextFieldValorApelido.setEnabled(modoAlteracao);
        jTextFieldValorAltura.setEnabled(modoAlteracao);
        jTextFieldValorBairro.setEnabled(modoAlteracao);
        jTextFieldValorCep.setEnabled(modoAlteracao);
        jTextFieldValorCidade.setEnabled(modoAlteracao);
        jTextFieldValorComplemento.setEnabled(modoAlteracao);
        jTextFieldValorCpf.setEnabled(modoAlteracao);
        jTextFieldValorDataDeNascimento.setEnabled(modoAlteracao);
        jTextFieldValorEnvergadura.setEnabled(modoAlteracao);
        jTextFieldValorImpulso.setEnabled(modoAlteracao);
        jTextFieldValorLogradouro.setEnabled(modoAlteracao);
        jTextFieldValorNome.setEnabled(modoAlteracao);
        jTextFieldValorNomeDaMae.setEnabled(modoAlteracao);
        jTextFieldValorNomeDoPai.setEnabled(modoAlteracao);
        jTextFieldValorNumero.setEnabled(modoAlteracao);
        jTextFieldValorNumeroDaCamisa.setEnabled(modoAlteracao);
        jTextFieldValorPais.setEnabled(modoAlteracao);
        jTextFieldValorPeso.setEnabled(modoAlteracao);
        jTextFieldValorRg.setEnabled(modoAlteracao);
        jTextFieldValorTempoDeReacao.setEnabled(modoAlteracao);
        
        jComboBoxValorEstado.setEnabled(modoAlteracao);
        jComboBoxValorArremessoComBase.setEnabled(modoAlteracao);
        jComboBoxValorArremessoComGancho.setEnabled(modoAlteracao);
        jComboBoxValorArremessoGarrafao.setEnabled(modoAlteracao);
        jComboBoxValorArremessoLongo.setEnabled(modoAlteracao);
        jComboBoxValorArremessoMedio.setEnabled(modoAlteracao);
        jComboBoxValorArremessoTresPontos.setEnabled(modoAlteracao);
        jComboBoxValorAtitudeDeEquipe.setEnabled(modoAlteracao);
        jComboBoxValorBandeja.setEnabled(modoAlteracao);
        jComboBoxValorBloqueio.setEnabled(modoAlteracao);
        jComboBoxValorCompetitividade.setEnabled(modoAlteracao);
        jComboBoxValorDesarme.setEnabled(modoAlteracao);
        jComboBoxValorDominioDaBola.setEnabled(modoAlteracao);
        jComboBoxValorDrible.setEnabled(modoAlteracao);
        jComboBoxValorEnterrada.setEnabled(modoAlteracao);
        jComboBoxValorEstado.setEnabled(modoAlteracao);
        jComboBoxValorHistoricoDeLesao.setEnabled(modoAlteracao);
        jComboBoxValorImpactoPressao.setEnabled(modoAlteracao);
        jComboBoxValorLanceLivre.setEnabled(modoAlteracao);
        jComboBoxValorLideranca.setEnabled(modoAlteracao);
        jComboBoxValorMaoDominante.setEnabled(modoAlteracao);
        jComboBoxValorPassePeito.setEnabled(modoAlteracao);
        jComboBoxValorPasseQuicado.setEnabled(modoAlteracao);
        jComboBoxValorPosicao.setEnabled(modoAlteracao);
        jComboBoxValorReboteDefensivo.setEnabled(modoAlteracao);
        jComboBoxValorReboteOfensivo.setEnabled(modoAlteracao);
        jComboBoxValorResistencia.setEnabled(modoAlteracao);
        jComboBoxValorSensoDeQuadra.setEnabled(modoAlteracao);
        jComboBoxValorSexo.setEnabled(modoAlteracao);
        
        jButtonNovo.setEnabled(modoAlteracao == false);
        jButtonAlterar.setEnabled(modoAlteracao == false && registroSelecionado == true);
        jButtonExcluir.setEnabled(modoAlteracao == false && registroSelecionado == true);
        jButtonBuscar.setEnabled(modoAlteracao == false);
        jButtonSalvar.setEnabled(modoAlteracao);
        jButtonCancelar.setEnabled(modoAlteracao);
        jButtonAdicionarTelefone.setEnabled(modoAlteracao);
        jButtonRemoverTelefone.setEnabled(modoAlteracao);
        jButtonAdicionarPremiacao.setEnabled(modoAlteracao);
        jButtonRemoverPremiacao.setEnabled(modoAlteracao);
        
        jTableListaJogadoresDeBasquete.setEnabled(modoAlteracao == false);
    }
     
    
    private void preencherCampos() {
        
        ArrayList<String> telefones;
        ArrayList<Premiacao> premiacoes;
     
        jComboBoxValorArremessoComBase.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoComBase());
        jComboBoxValorArremessoComGancho.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoComGancho());
        jComboBoxValorArremessoGarrafao.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoGarrafao());
        jComboBoxValorArremessoLongo.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoLongo());
        jComboBoxValorArremessoMedio.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoMedio());
        jComboBoxValorArremessoTresPontos.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getArremessoTresPontos());
        jComboBoxValorAtitudeDeEquipe.setSelectedItem(umJogadorDeBasquete.getAtributosMentais().getAtitudeDeEquipe());
        jComboBoxValorBandeja.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getBandeja());
        jComboBoxValorBloqueio.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getBloqueio());
        jComboBoxValorCompetitividade.setSelectedItem(umJogadorDeBasquete.getAtributosMentais().getCompetitividade());
        jComboBoxValorDesarme.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getDesarme());
        jComboBoxValorDominioDaBola.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getDominioDaBola());
        jComboBoxValorDrible.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getDrible());
        jComboBoxValorEnterrada.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getEnterrada());
        jComboBoxValorEstado.setSelectedItem(umJogadorDeBasquete.getEndereco().getEstado());
        jComboBoxValorHistoricoDeLesao.setSelectedItem(umJogadorDeBasquete.getAtributosFisicos().getHistoricoDeLesao());
        jComboBoxValorImpactoPressao.setSelectedItem(umJogadorDeBasquete.getAtributosMentais().getImpactoDaPressao());
        jComboBoxValorLanceLivre.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getLanceLivre());
        jComboBoxValorLideranca.setSelectedItem(umJogadorDeBasquete.getAtributosMentais().getLideranca());
        jComboBoxValorMaoDominante.setSelectedItem(umJogadorDeBasquete.getMaoDominante());
        jComboBoxValorPassePeito.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getPassePeito());
        jComboBoxValorPasseQuicado.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getPasseQuicado());
        jComboBoxValorPosicao.setSelectedItem(umJogadorDeBasquete.getPosicao());
        jComboBoxValorReboteDefensivo.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getReboteDefensivo());
        jComboBoxValorReboteOfensivo.setSelectedItem(umJogadorDeBasquete.getAtributosTecnicos().getReboteOfensivo());
        jComboBoxValorResistencia.setSelectedItem(umJogadorDeBasquete.getAtributosFisicos().getResistencia());
        jComboBoxValorSensoDeQuadra.setSelectedItem(umJogadorDeBasquete.getAtributosMentais().getSensoDeQuadra());
        jComboBoxValorSexo.setSelectedItem(umJogadorDeBasquete.getSexo());
        
        jTextFieldValorAceleracao.setText(Double.toString(umJogadorDeBasquete.getAtributosFisicos().getAceleracao()));
        jTextFieldValorAltura.setText(Double.toString(umJogadorDeBasquete.getAltura()));
        jTextFieldValorApelido.setText(umJogadorDeBasquete.getApelido());
        jTextFieldValorBairro.setText(umJogadorDeBasquete.getEndereco().getBairro());
        jTextFieldValorCep.setText(umJogadorDeBasquete.getEndereco().getCep());
        jTextFieldValorCidade.setText(umJogadorDeBasquete.getEndereco().getCidade());
        jTextFieldValorComplemento.setText(umJogadorDeBasquete.getEndereco().getComplemento());
        jTextFieldValorCpf.setText(umJogadorDeBasquete.getCpf());
        if (umJogadorDeBasquete.getDataNascimento() == null) {
            jTextFieldValorDataDeNascimento.setText(null);
        } else {
            jTextFieldValorDataDeNascimento.setText(dateFormat.format(umJogadorDeBasquete.getDataNascimento()));
        }
        jTextFieldValorEnvergadura.setText(Double.toString(umJogadorDeBasquete.getAtributosFisicos().getEnvergadura()));
        jTextFieldValorImpulso.setText(Double.toString(umJogadorDeBasquete.getAtributosFisicos().getImpulso()));
        jTextFieldValorLogradouro.setText(umJogadorDeBasquete.getEndereco().getLogradouro());
        jTextFieldValorNome.setText(umJogadorDeBasquete.getNome());
        jTextFieldValorNomeDaMae.setText(umJogadorDeBasquete.getNomeMae());
        jTextFieldValorNomeDoPai.setText(umJogadorDeBasquete.getNomePai());
        jTextFieldValorNumero.setText(umJogadorDeBasquete.getEndereco().getNumero());
        jTextFieldValorNumeroDaCamisa.setText(Integer.toString(umJogadorDeBasquete.getNumeroDaCamisa()));
        jTextFieldValorPais.setText(umJogadorDeBasquete.getEndereco().getPais());
        jTextFieldValorPeso.setText(Double.toString(umJogadorDeBasquete.getPeso()));
        jTextFieldValorRg.setText(umJogadorDeBasquete.getRg());
        jTextFieldValorTempoDeReacao.setText(Double.toString(umJogadorDeBasquete.getAtributosFisicos().getTempoDeReacao()));
        
        telefonesListModel.clear();
        telefones = umJogadorDeBasquete.getTelefones();
        for (String umTelefone : telefones) {
            telefonesListModel.addElement(umTelefone);
        }

        premiacaoListModel.clear();
        premiacoes = umJogadorDeBasquete.getPremiacoes();
        for (Premiacao umaPremiacao : premiacoes) {
            premiacaoListModel.addElement(umaPremiacao);
        }
        
    }
    private boolean validarCampos() {
        if (jTextFieldValorNome.getText().trim().length() == 0) {
            this.exibirInformacao("O valor do campo 'Nome' não foi informado.");
            jTextFieldValorNome.requestFocus();
            return false;
        }
        if (jTextFieldValorDataDeNascimento.getText().length() != 0) {
            try {
                dateFormat.parse(jTextFieldValorDataDeNascimento.getText());
            } catch (ParseException ex) {
                this.exibirInformacao("O valor do campo 'Data de Nascimento' é inválido.");
                jTextFieldValorDataDeNascimento.requestFocus();
                return false;
            }
        }
        try {
            Double.parseDouble(jTextFieldValorAltura.getText());
        } catch (Exception ex) {
            this.exibirInformacao("O valor do campo 'Altura' é inválido.");
            jTextFieldValorAltura.requestFocus();
            return false;
        }
        try {
            Double.parseDouble(jTextFieldValorPeso.getText());
        } catch (Exception ex) {
            this.exibirInformacao("O valor do campo 'Peso' é inválido.");
            jTextFieldValorPeso.requestFocus();
            return false;
        }
        if (!jTextFieldValorNumero.getText().equals("")) {
            try {
                Integer.parseInt(jTextFieldValorNumero.getText());
            } catch (Exception ex) {
                this.exibirInformacao("O valor do campo 'Número' é inválido.");
                jTextFieldValorNumero.requestFocus();
                return false;
            }
        }
        return true;
    }
    
    private void salvarRegistro() {
      
        
        Endereco endereco;
        ArrayList<String> telefones;
        ArrayList<Premiacao> premiacoes;
        Date dataNascimento;
        AtributosFisicos atributosFisicos;
        AtributosMentais atributosMentais;
        AtributosTecnicos atributosTecnicos;
        
        
        if (jTextFieldValorNome.getText().trim().length() == 0) {
            this.exibirInformacao("O valor do campo 'Nome' não foi informado.");
            jTextFieldValorNome.requestFocus();
            return;

        }

        if (jTextFieldValorDataDeNascimento.getText().length() == 0) {
            dataNascimento = null;
        } else {
            try {
                dataNascimento = dateFormat.parse(jTextFieldValorDataDeNascimento.getText());
            } catch (ParseException ex) {
                exibirInformacao("Falha ao gravar a data de nascimento: " + ex.toString());
                return;
            }
        }
        

        endereco = new Endereco();
        endereco.setBairro(jTextFieldValorBairro.getText());
        endereco.setCep(jTextFieldValorCep.getText());
        endereco.setCidade(jTextFieldValorCidade.getText());
        endereco.setComplemento(jTextFieldValorComplemento.getText());
        endereco.setEstado((String) jComboBoxValorEstado.getSelectedItem());
        endereco.setLogradouro(jTextFieldValorLogradouro.getText());
        endereco.setNumero(jTextFieldValorNumero.getText());
        endereco.setPais(jTextFieldValorPais.getText());
        
        
        atributosFisicos = new AtributosFisicos();
        atributosFisicos.setAceleracao(Double.parseDouble(jTextFieldValorAceleracao.getText()));
        atributosFisicos.setEnvergadura(Double.parseDouble(jTextFieldValorEnvergadura.getText()));
        atributosFisicos.setImpulso(Double.parseDouble(jTextFieldValorImpulso.getText()));
        atributosFisicos.setTempoDeReacao(Double.parseDouble(jTextFieldValorTempoDeReacao.getText()));
        atributosFisicos.setHistoricoDeLesao((String) jComboBoxValorHistoricoDeLesao.getSelectedItem());
        atributosFisicos.setResistencia((String) jComboBoxValorResistencia.getSelectedItem());
        
        atributosMentais = new AtributosMentais();
        atributosMentais.setAtitudeDeEquipe((String) jComboBoxValorAtitudeDeEquipe.getSelectedItem());
        atributosMentais.setCompetitividade((String) jComboBoxValorCompetitividade.getSelectedItem());
        atributosMentais.setImpactoDaPressao((String) jComboBoxValorImpactoPressao.getSelectedItem());
        atributosMentais.setLideranca((String) jComboBoxValorLideranca.getSelectedItem());
        atributosMentais.setSensoDeQuadra((String) jComboBoxValorSensoDeQuadra.getSelectedItem());
        
        atributosTecnicos = new AtributosTecnicos();
        atributosTecnicos.setArremessoComBase((String) jComboBoxValorArremessoComBase.getSelectedItem());
        atributosTecnicos.setArremessoComGancho((String) jComboBoxValorArremessoComGancho.getSelectedItem());
        atributosTecnicos.setArremessoGarrafao((String) jComboBoxValorArremessoGarrafao.getSelectedItem());
        atributosTecnicos.setArremessoLongo((String) jComboBoxValorArremessoLongo.getSelectedItem());
        atributosTecnicos.setArremessoMedio((String) jComboBoxValorArremessoMedio.getSelectedItem());
        atributosTecnicos.setArremessoTresPontos((String) jComboBoxValorArremessoTresPontos.getSelectedItem());
        atributosTecnicos.setBandeja((String) jComboBoxValorBandeja.getSelectedItem());
        atributosTecnicos.setBloqueio((String) jComboBoxValorBloqueio.getSelectedItem());
        atributosTecnicos.setDesarme((String) jComboBoxValorDesarme.getSelectedItem());
        atributosTecnicos.setDominioDaBola((String) jComboBoxValorDominioDaBola.getSelectedItem());
        atributosTecnicos.setDrible((String) jComboBoxValorDrible.getSelectedItem());
        atributosTecnicos.setEnterrada((String) jComboBoxValorEnterrada.getSelectedItem());
        atributosTecnicos.setHabilidadeDeToco((String) jComboBoxValorHabilidadeToco.getSelectedItem());
        atributosTecnicos.setLanceLivre((String) jComboBoxValorLanceLivre.getSelectedItem());
        atributosTecnicos.setPassePeito((String) jComboBoxValorPassePeito.getSelectedItem());
        atributosTecnicos.setPasseQuicado((String) jComboBoxValorPasseQuicado.getSelectedItem());
        atributosTecnicos.setReboteDefensivo((String) jComboBoxValorReboteDefensivo.getSelectedItem());
        atributosTecnicos.setReboteOfensivo((String) jComboBoxValorReboteOfensivo.getSelectedItem());
        
        
        telefones = new ArrayList<String>();
        for (int i = 0; i < telefonesListModel.size(); i++) {
            telefones.add(telefonesListModel.getElementAt(i).toString());
        }

        premiacoes = new ArrayList<Premiacao>();
        for (int i = 0; i < premiacaoListModel.size(); i++) {
            Premiacao premiacao = (Premiacao) premiacaoListModel.getElementAt(i);
            premiacoes.add(premiacao);
        }
        
        if (novoRegistro == true) {
            
            umJogadorDeBasquete = new JogadorDeBasquete(jTextFieldValorNome.getText());
        } else {
            
            umJogadorDeBasquete.setNome(jTextFieldValorNome.getText());
        }
        umJogadorDeBasquete.setEndereco(endereco);
        umJogadorDeBasquete.setTelefones(telefones);
        umJogadorDeBasquete.setPremiacoes(premiacoes);
        umJogadorDeBasquete.setDataNascimento(dataNascimento);
        umJogadorDeBasquete.setApelido(jTextFieldValorApelido.getText());
        umJogadorDeBasquete.setAtributosFisicos(atributosFisicos);
        umJogadorDeBasquete.setAtributosMentais(atributosMentais);
        umJogadorDeBasquete.setAtributosTecnicos(atributosTecnicos);
        umJogadorDeBasquete.setMaoDominante((String) jComboBoxValorMaoDominante.getSelectedItem());
        umJogadorDeBasquete.setNumeroDaCamisa(Integer.parseInt(jTextFieldValorNumeroDaCamisa.getText()));
        umJogadorDeBasquete.setPosicao((String) jComboBoxValorPosicao.getSelectedItem());
        umJogadorDeBasquete.setAltura(Double.parseDouble(jTextFieldValorAltura.getText()));
        umJogadorDeBasquete.setNomeMae(jTextFieldValorNomeDaMae.getText());
        umJogadorDeBasquete.setNomePai(jTextFieldValorNomeDoPai.getText());
        umJogadorDeBasquete.setPeso(Double.parseDouble(jTextFieldValorPeso.getText()));
        umJogadorDeBasquete.setCpf(jTextFieldValorCpf.getText());
        umJogadorDeBasquete.setRg(jTextFieldValorRg.getText());
        
        
        if (novoRegistro == true) {
            controleJogadorDeBasquete.adicionar(umJogadorDeBasquete);
        }
        modoAlteracao = false;
        novoRegistro = false;
        this.limparCampos();
        this.carregarListaJogadoresDeBasquete();
        this.habilitarDesabilitarCampos();
      
    }
    
    private void carregarListaJogadoresDeBasquete() {
        ArrayList<JogadorDeBasquete> listaJogadoresDeBasquete = controleJogadorDeBasquete.getListaJogadoresDeBasquete();
        DefaultTableModel model = (DefaultTableModel) jTableListaJogadoresDeBasquete.getModel();
        model.setRowCount(0);
        for (JogadorDeBasquete i: listaJogadoresDeBasquete) {
            model.addRow(new String[]{i.getNome(), i.getCpf()});
        }
        jTableListaJogadoresDeBasquete.setModel(model);
    }
    
    private void exibirInformacao(String info) {
        JOptionPane.showMessageDialog(this, info, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMenuPrincipal = new javax.swing.JTabbedPane();
        jPanelNovo = new javax.swing.JPanel();
        jTabbedPanelCadastro = new javax.swing.JTabbedPane();
        jPanelInformacoesGerais = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldValorNome = new javax.swing.JTextField();
        jLabelDataDeNascimento = new javax.swing.JLabel();
        jTextFieldValorDataDeNascimento = new javax.swing.JTextField();
        jLabelNomeDoPai = new javax.swing.JLabel();
        jTextFieldValorNomeDoPai = new javax.swing.JTextField();
        jLabelNomeDaMae = new javax.swing.JLabel();
        jTextFieldValorNomeDaMae = new javax.swing.JTextField();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldValorRg = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldValorCpf = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldValorAltura = new javax.swing.JTextField();
        jLabelAltura = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldValorPeso = new javax.swing.JTextField();
        jLabelTelefones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTelefones = new javax.swing.JList();
        jButtonAdicionarTelefone = new javax.swing.JButton();
        jButtonRemoverTelefone = new javax.swing.JButton();
        jComboBoxValorSexo = new javax.swing.JComboBox();
        jLabelPremiacoes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPremiacoes = new javax.swing.JList();
        jButtonAdicionarPremiacao = new javax.swing.JButton();
        jButtonRemoverPremiacao = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelLogradouro = new javax.swing.JLabel();
        jTextFieldValorLogradouro = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldValorNumero = new javax.swing.JTextField();
        jTextFieldValorBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldValorCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldValorPais = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldValorComplemento = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jComboBoxValorEstado = new javax.swing.JComboBox();
        jTextFieldValorCep = new javax.swing.JTextField();
        jPanelCaracteristicasFisicas = new javax.swing.JPanel();
        jLabelEnvergadura = new javax.swing.JLabel();
        jLabelImpulso = new javax.swing.JLabel();
        jLabelResistencia = new javax.swing.JLabel();
        jLabelTempoDeReacao = new javax.swing.JLabel();
        jLabelAceleracao = new javax.swing.JLabel();
        jLabelHistoricoDeLesao = new javax.swing.JLabel();
        jTextFieldValorEnvergadura = new javax.swing.JTextField();
        jTextFieldValorImpulso = new javax.swing.JTextField();
        jComboBoxValorResistencia = new javax.swing.JComboBox();
        jTextFieldValorTempoDeReacao = new javax.swing.JTextField();
        jTextFieldValorAceleracao = new javax.swing.JTextField();
        jComboBoxValorHistoricoDeLesao = new javax.swing.JComboBox();
        jPanelFichaTecnica = new javax.swing.JPanel();
        jLabelApelido = new javax.swing.JLabel();
        jLabelPosicao = new javax.swing.JLabel();
        jTextFieldValorApelido = new javax.swing.JTextField();
        jComboBoxValorPosicao = new javax.swing.JComboBox();
        jLabelNumeroDaCamisa = new javax.swing.JLabel();
        jLabelMaoDominante = new javax.swing.JLabel();
        jTextFieldValorNumeroDaCamisa = new javax.swing.JTextField();
        jComboBoxValorMaoDominante = new javax.swing.JComboBox();
        jLabelHabilidades = new javax.swing.JLabel();
        jLabelArremessoGarrafao = new javax.swing.JLabel();
        jLabelArremessoMedio = new javax.swing.JLabel();
        jLabelArremessoLongo = new javax.swing.JLabel();
        jLabelArremessoComGancho = new javax.swing.JLabel();
        jLabelArremessoComBase = new javax.swing.JLabel();
        jComboBoxValorArremessoGarrafao = new javax.swing.JComboBox();
        jComboBoxValorArremessoMedio = new javax.swing.JComboBox();
        jComboBoxValorArremessoLongo = new javax.swing.JComboBox();
        jComboBoxValorArremessoComGancho = new javax.swing.JComboBox();
        jComboBoxValorArremessoComBase = new javax.swing.JComboBox();
        jLabelArremessoTresPontos = new javax.swing.JLabel();
        jComboBoxValorArremessoTresPontos = new javax.swing.JComboBox();
        jLabelLanceLivre = new javax.swing.JLabel();
        jLabelBandeja = new javax.swing.JLabel();
        jLabelEnterrada = new javax.swing.JLabel();
        jLabelDrible = new javax.swing.JLabel();
        jLabelPassePeito = new javax.swing.JLabel();
        jLabelPasseQuicado = new javax.swing.JLabel();
        jComboBoxValorLanceLivre = new javax.swing.JComboBox();
        jComboBoxValorBandeja = new javax.swing.JComboBox();
        jComboBoxValorEnterrada = new javax.swing.JComboBox();
        jComboBoxValorDrible = new javax.swing.JComboBox();
        jComboBoxValorPassePeito = new javax.swing.JComboBox();
        jComboBoxValorPasseQuicado = new javax.swing.JComboBox();
        jLabelDominioDaBola = new javax.swing.JLabel();
        jLabelBloqueio = new javax.swing.JLabel();
        jLabelDesarme = new javax.swing.JLabel();
        jLabelReboteOfensivo = new javax.swing.JLabel();
        jLabelReboteDefensivo = new javax.swing.JLabel();
        jLabelHabilidadeToco = new javax.swing.JLabel();
        jComboBoxValorDominioDaBola = new javax.swing.JComboBox();
        jComboBoxValorBloqueio = new javax.swing.JComboBox();
        jComboBoxValorDesarme = new javax.swing.JComboBox();
        jComboBoxValorReboteOfensivo = new javax.swing.JComboBox();
        jComboBoxValorReboteDefensivo = new javax.swing.JComboBox();
        jComboBoxValorHabilidadeToco = new javax.swing.JComboBox();
        jPanelCaracteristicasPsicologicas = new javax.swing.JPanel();
        jLabelSensoDeQuadra = new javax.swing.JLabel();
        jLabelAtitudeDeEquipe = new javax.swing.JLabel();
        jLabelCOmpetitividade = new javax.swing.JLabel();
        jLabelLideranca = new javax.swing.JLabel();
        jLabelImpactoPressao = new javax.swing.JLabel();
        jComboBoxValorSensoDeQuadra = new javax.swing.JComboBox();
        jComboBoxValorAtitudeDeEquipe = new javax.swing.JComboBox();
        jComboBoxValorCompetitividade = new javax.swing.JComboBox();
        jComboBoxValorLideranca = new javax.swing.JComboBox();
        jComboBoxValorImpactoPressao = new javax.swing.JComboBox();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jPanelBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jTextFieldValorBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jPanelBuscarJogadorDeBasquete = new javax.swing.JPanel();
        jPanelLIstarTodos = new javax.swing.JPanel();
        jLabelListaJogadoresDeBasquete = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableListaJogadoresDeBasquete = new javax.swing.JTable();
        jPanelAlterar = new javax.swing.JPanel();
        jLabelAlterar = new javax.swing.JLabel();
        jTextFieldValorAlterar = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();
        jPanelExcluir = new javax.swing.JPanel();
        jLabelExcluir = new javax.swing.JLabel();
        jTextFieldValorExcluir = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jTextFieldValorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorNomeActionPerformed(evt);
            }
        });

        jLabelDataDeNascimento.setText("Data de Nascimento:");

        jTextFieldValorDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorDataDeNascimentoActionPerformed(evt);
            }
        });

        jLabelNomeDoPai.setText("Nome do Pai:");

        jTextFieldValorNomeDoPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorNomeDoPaiActionPerformed(evt);
            }
        });

        jLabelNomeDaMae.setText("Nome da Mãe:");

        jLabelRg.setText("RG:");

        jLabelCpf.setText("CPF:");

        jLabelSexo.setText("Sexo:");

        jTextFieldValorAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorAlturaActionPerformed(evt);
            }
        });

        jLabelAltura.setText("Altura:");

        jLabelPeso.setText("Peso:");

        jLabelTelefones.setText("Telefones:");

        jListTelefones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListTelefones);

        jButtonAdicionarTelefone.setText("+");
        jButtonAdicionarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarTelefoneActionPerformed(evt);
            }
        });

        jButtonRemoverTelefone.setText("-");
        jButtonRemoverTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTelefoneActionPerformed(evt);
            }
        });

        jComboBoxValorSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBoxValorSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValorSexoActionPerformed(evt);
            }
        });

        jLabelPremiacoes.setText("Premiações:");

        jScrollPane2.setViewportView(jListPremiacoes);

        jButtonAdicionarPremiacao.setText("+");
        jButtonAdicionarPremiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarPremiacaoActionPerformed(evt);
            }
        });

        jButtonRemoverPremiacao.setText("-");
        jButtonRemoverPremiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverPremiacaoActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo jogador");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformacoesGeraisLayout = new javax.swing.GroupLayout(jPanelInformacoesGerais);
        jPanelInformacoesGerais.setLayout(jPanelInformacoesGeraisLayout);
        jPanelInformacoesGeraisLayout.setHorizontalGroup(
            jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPremiacoes)
                        .addGap(243, 243, 243))
                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                        .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                        .addComponent(jLabelSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxValorSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                        .addComponent(jLabelDataDeNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldValorDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAltura)
                                    .addComponent(jLabelRg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldValorRg, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorAltura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCpf)
                                    .addComponent(jLabelPeso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldValorPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorCpf)))
                            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNomeDoPai)
                                    .addComponent(jLabelNomeDaMae))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldValorNomeDoPai, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonRemoverTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldValorNomeDaMae, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAdicionarPremiacao, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jButtonRemoverPremiacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanelInformacoesGeraisLayout.setVerticalGroup(
            jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldValorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAdicionarPremiacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverPremiacao)))
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataDeNascimento)
                    .addComponent(jTextFieldValorDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRg)
                    .addComponent(jTextFieldValorRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldValorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxValorSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelAltura)
                        .addComponent(jTextFieldValorAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPeso)
                        .addComponent(jTextFieldValorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorNomeDaMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeDaMae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorNomeDoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeDoPai))
                .addGroup(jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonRemoverTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacoesGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonAdicionarTelefone)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTelefones)))
                .addGap(86, 86, 86))
            .addGroup(jPanelInformacoesGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPremiacoes)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldValorDataDeNascimento.getAccessibleContext().setAccessibleParent(null);
        jTextFieldValorNomeDoPai.getAccessibleContext().setAccessibleParent(null);

        jTabbedPanelCadastro.addTab("Informaçoẽs Gerais", jPanelInformacoesGerais);

        jLabelLogradouro.setText("Logradouro:");

        jLabelNumero.setText("Número:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("Estado:");

        jLabelPais.setText("País:");

        jLabelComplemento.setText("Complemento:");

        jLabelCep.setText("CEP:");

        jComboBoxValorEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldValorComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addComponent(jTextFieldValorLogradouro)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jTextFieldValorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldValorCep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jTextFieldValorPais, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxValorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldValorLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelLogradouro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldValorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldValorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldValorComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPais)
                    .addComponent(jTextFieldValorPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldValorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxValorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jTextFieldValorCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPanelCadastro.addTab("Endereço", jPanelEndereco);

        jLabelEnvergadura.setText("Envergadura (em cm) :");

        jLabelImpulso.setText("Impulso (porcentagem em relação a uma altura de 2 m) :");

        jLabelResistencia.setText("Resistência:");

        jLabelTempoDeReacao.setText("Tempo de reação:");

        jLabelAceleracao.setText("Aceleração (no pique) :");

        jLabelHistoricoDeLesao.setText("HIstórico de Lesão:");

        jComboBoxValorResistencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótima", "Regular", "Ruim", "Péssima" }));

        jComboBoxValorHistoricoDeLesao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lesionado anteriormente", "Não  lesionado" }));

        javax.swing.GroupLayout jPanelCaracteristicasFisicasLayout = new javax.swing.GroupLayout(jPanelCaracteristicasFisicas);
        jPanelCaracteristicasFisicas.setLayout(jPanelCaracteristicasFisicasLayout);
        jPanelCaracteristicasFisicasLayout.setHorizontalGroup(
            jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                            .addComponent(jLabelEnvergadura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldValorEnvergadura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelTempoDeReacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldValorTempoDeReacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                            .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                                    .addComponent(jLabelResistencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxValorResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabelAceleracao))
                                .addComponent(jLabelImpulso))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldValorImpulso)
                                .addComponent(jTextFieldValorAceleracao))))
                    .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                        .addComponent(jLabelHistoricoDeLesao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxValorHistoricoDeLesao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanelCaracteristicasFisicasLayout.setVerticalGroup(
            jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaracteristicasFisicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnvergadura)
                    .addComponent(jTextFieldValorEnvergadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTempoDeReacao)
                    .addComponent(jTextFieldValorTempoDeReacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImpulso)
                    .addComponent(jTextFieldValorImpulso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResistencia)
                    .addComponent(jComboBoxValorResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAceleracao)
                    .addComponent(jTextFieldValorAceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelCaracteristicasFisicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHistoricoDeLesao)
                    .addComponent(jComboBoxValorHistoricoDeLesao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPanelCadastro.addTab("Características Físicas", jPanelCaracteristicasFisicas);

        jLabelApelido.setText("Apelido:");

        jLabelPosicao.setText("Posição:");

        jComboBoxValorPosicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Armador", "Ala-armador", "Ala", "Ala-pivô", "Pivô" }));

        jLabelNumeroDaCamisa.setText("Numero da camisa:");

        jLabelMaoDominante.setText("Mão Dominante:");

        jComboBoxValorMaoDominante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Esquerda", "Direita" }));

        jLabelHabilidades.setText("Habilidades:");

        jLabelArremessoGarrafao.setText("Arremesso no garrafão:");

        jLabelArremessoMedio.setText("Arremesso a distância média:");

        jLabelArremessoLongo.setText("Aremesso a distância longa:");

        jLabelArremessoComGancho.setText("Aremesso com gancho:");

        jLabelArremessoComBase.setText("Arremesso com base:");

        jComboBoxValorArremessoGarrafao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorArremessoMedio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorArremessoLongo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorArremessoComGancho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorArremessoComBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jLabelArremessoTresPontos.setText("Arremesso de três pontos:");

        jComboBoxValorArremessoTresPontos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jLabelLanceLivre.setText("Lance livre:");

        jLabelBandeja.setText("Bandeja:");

        jLabelEnterrada.setText("Enterrada:");

        jLabelDrible.setText("Drible:");

        jLabelPassePeito.setText("Passe de peito:");

        jLabelPasseQuicado.setText("Passe quicado:");

        jComboBoxValorLanceLivre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorBandeja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorEnterrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorDrible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorPassePeito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorPasseQuicado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jLabelDominioDaBola.setText("Domínio da bola:");

        jLabelBloqueio.setText("Bloqueio:");

        jLabelDesarme.setText("Desarme:");

        jLabelReboteOfensivo.setText("Rebote ofensivo:");

        jLabelReboteDefensivo.setText("Rebote defensivo:");

        jLabelHabilidadeToco.setText("\"Toco\":");

        jComboBoxValorDominioDaBola.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorBloqueio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorDesarme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorReboteOfensivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorReboteDefensivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorHabilidadeToco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        javax.swing.GroupLayout jPanelFichaTecnicaLayout = new javax.swing.GroupLayout(jPanelFichaTecnica);
        jPanelFichaTecnica.setLayout(jPanelFichaTecnicaLayout);
        jPanelFichaTecnicaLayout.setHorizontalGroup(
            jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelApelido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNumeroDaCamisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorNumeroDaCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPosicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxValorPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMaoDominante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxValorMaoDominante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHabilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelArremessoLongo)
                            .addComponent(jLabelArremessoMedio)
                            .addComponent(jLabelArremessoGarrafao)
                            .addComponent(jLabelArremessoComGancho)
                            .addComponent(jLabelArremessoComBase)
                            .addComponent(jLabelArremessoTresPontos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxValorArremessoGarrafao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelLanceLivre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorLanceLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxValorArremessoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelBandeja)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorBandeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxValorArremessoLongo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelEnterrada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorEnterrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxValorArremessoComGancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDrible)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorDrible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jComboBoxValorArremessoComBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelPassePeito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxValorPassePeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jLabelDominioDaBola)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorDominioDaBola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jLabelBloqueio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorBloqueio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFichaTecnicaLayout.createSequentialGroup()
                                        .addComponent(jLabelDesarme)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxValorDesarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxValorHabilidadeToco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                                .addComponent(jLabelReboteOfensivo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxValorReboteOfensivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFichaTecnicaLayout.createSequentialGroup()
                                                .addComponent(jLabelReboteDefensivo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxValorReboteDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                                .addComponent(jComboBoxValorArremessoTresPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPasseQuicado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxValorPasseQuicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelHabilidadeToco)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFichaTecnicaLayout.setVerticalGroup(
            jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFichaTecnicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApelido)
                    .addComponent(jTextFieldValorApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroDaCamisa)
                    .addComponent(jTextFieldValorNumeroDaCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPosicao)
                    .addComponent(jComboBoxValorPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMaoDominante)
                    .addComponent(jComboBoxValorMaoDominante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHabilidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoGarrafao)
                    .addComponent(jComboBoxValorArremessoGarrafao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLanceLivre)
                    .addComponent(jComboBoxValorLanceLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDominioDaBola)
                    .addComponent(jComboBoxValorDominioDaBola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoMedio)
                    .addComponent(jComboBoxValorArremessoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBandeja)
                    .addComponent(jComboBoxValorBandeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBloqueio)
                    .addComponent(jComboBoxValorBloqueio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoLongo)
                    .addComponent(jComboBoxValorArremessoLongo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEnterrada)
                    .addComponent(jComboBoxValorEnterrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDesarme)
                    .addComponent(jComboBoxValorDesarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoComGancho)
                    .addComponent(jComboBoxValorArremessoComGancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDrible)
                    .addComponent(jComboBoxValorDrible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReboteOfensivo)
                    .addComponent(jComboBoxValorReboteOfensivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoComBase)
                    .addComponent(jComboBoxValorArremessoComBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassePeito)
                    .addComponent(jComboBoxValorPassePeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReboteDefensivo)
                    .addComponent(jComboBoxValorReboteDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArremessoTresPontos)
                    .addComponent(jComboBoxValorArremessoTresPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPasseQuicado)
                    .addComponent(jComboBoxValorPasseQuicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHabilidadeToco)
                    .addComponent(jComboBoxValorHabilidadeToco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPanelCadastro.addTab("FIcha Técnica", jPanelFichaTecnica);

        jLabelSensoDeQuadra.setText("Senso de quadra:");

        jLabelAtitudeDeEquipe.setText("Atitude de equipe:");

        jLabelCOmpetitividade.setText("Competitividade:");

        jLabelLideranca.setText("Liderança:");

        jLabelImpactoPressao.setText("Impacto da \"pressão\" no atleta:");

        jComboBoxValorSensoDeQuadra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorAtitudeDeEquipe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelente", "Ótimo", "Regular", "Ruim", "Péssimo" }));

        jComboBoxValorCompetitividade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Média", "Baixa" }));

        jComboBoxValorLideranca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Média", "Baixa" }));

        jComboBoxValorImpactoPressao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Média", "Baixa" }));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCaracteristicasPsicologicasLayout = new javax.swing.GroupLayout(jPanelCaracteristicasPsicologicas);
        jPanelCaracteristicasPsicologicas.setLayout(jPanelCaracteristicasPsicologicasLayout);
        jPanelCaracteristicasPsicologicasLayout.setHorizontalGroup(
            jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                        .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                                .addComponent(jLabelImpactoPressao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxValorImpactoPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSensoDeQuadra)
                                    .addComponent(jLabelAtitudeDeEquipe)
                                    .addComponent(jLabelCOmpetitividade)
                                    .addComponent(jLabelLideranca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxValorSensoDeQuadra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxValorAtitudeDeEquipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxValorCompetitividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxValorLideranca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 563, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelCaracteristicasPsicologicasLayout.setVerticalGroup(
            jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaracteristicasPsicologicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSensoDeQuadra)
                    .addComponent(jComboBoxValorSensoDeQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAtitudeDeEquipe)
                    .addComponent(jComboBoxValorAtitudeDeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCOmpetitividade)
                    .addComponent(jComboBoxValorCompetitividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLideranca)
                    .addComponent(jComboBoxValorLideranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImpactoPressao)
                    .addComponent(jComboBoxValorImpactoPressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanelCaracteristicasPsicologicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPanelCadastro.addTab("Características Psicológicas", jPanelCaracteristicasPsicologicas);

        javax.swing.GroupLayout jPanelNovoLayout = new javax.swing.GroupLayout(jPanelNovo);
        jPanelNovo.setLayout(jPanelNovoLayout);
        jPanelNovoLayout.setHorizontalGroup(
            jPanelNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanelCadastro)
        );
        jPanelNovoLayout.setVerticalGroup(
            jPanelNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanelCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, Short.MAX_VALUE)
        );

        jTabbedPaneMenuPrincipal.addTab("Cadastro", jPanelNovo);

        jLabelBuscar.setText("Digite o nome do jogador que deseja buscar:");

        jButtonBuscar.setText("Pesquisar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanelBuscarJogadorDeBasquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBuscarJogadorDeBasqueteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarJogadorDeBasqueteLayout = new javax.swing.GroupLayout(jPanelBuscarJogadorDeBasquete);
        jPanelBuscarJogadorDeBasquete.setLayout(jPanelBuscarJogadorDeBasqueteLayout);
        jPanelBuscarJogadorDeBasqueteLayout.setHorizontalGroup(
            jPanelBuscarJogadorDeBasqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelBuscarJogadorDeBasqueteLayout.setVerticalGroup(
            jPanelBuscarJogadorDeBasqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBuscarJogadorDeBasquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addComponent(jLabelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBuscar)
                    .addComponent(jTextFieldValorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBuscarJogadorDeBasquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMenuPrincipal.addTab("Buscar", jPanelBuscar);

        jLabelListaJogadoresDeBasquete.setText("Lista de todos os Jogadores de Basquete:");

        jTableListaJogadoresDeBasquete.setModel(new javax.swing.table.DefaultTableModel 
            (
                null,
                new String [] {
                    "Nome", "CPF"
                }
            )
            {
                @Override    
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            });
            jTableListaJogadoresDeBasquete.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableListaJogadoresDeBasqueteMouseClicked(evt);
                }
            });
            jScrollPane4.setViewportView(jTableListaJogadoresDeBasquete);

            javax.swing.GroupLayout jPanelLIstarTodosLayout = new javax.swing.GroupLayout(jPanelLIstarTodos);
            jPanelLIstarTodos.setLayout(jPanelLIstarTodosLayout);
            jPanelLIstarTodosLayout.setHorizontalGroup(
                jPanelLIstarTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLIstarTodosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelLIstarTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLIstarTodosLayout.createSequentialGroup()
                            .addComponent(jLabelListaJogadoresDeBasquete)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanelLIstarTodosLayout.setVerticalGroup(
                jPanelLIstarTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLIstarTodosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelListaJogadoresDeBasquete)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addContainerGap())
            );

            jTabbedPaneMenuPrincipal.addTab("Listar todos", jPanelLIstarTodos);

            jLabelAlterar.setText("Digite o nome do jogador que deseja alterar:");

            jTextFieldValorAlterar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldValorAlterarActionPerformed(evt);
                }
            });

            jButtonAlterar.setText("Alterar");
            jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAlterarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanelAlterarLayout = new javax.swing.GroupLayout(jPanelAlterar);
            jPanelAlterar.setLayout(jPanelAlterarLayout);
            jPanelAlterarLayout.setHorizontalGroup(
                jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlterarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelAlterar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldValorAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonAlterar)
                    .addContainerGap(124, Short.MAX_VALUE))
            );
            jPanelAlterarLayout.setVerticalGroup(
                jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlterarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAlterar)
                        .addComponent(jTextFieldValorAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAlterar))
                    .addContainerGap(344, Short.MAX_VALUE))
            );

            jTabbedPaneMenuPrincipal.addTab("Alterar", jPanelAlterar);

            jLabelExcluir.setText("Digite o nome do jogador que deseja excluir:");

            jButtonExcluir.setText("Excluir");
            jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonExcluirActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanelExcluirLayout = new javax.swing.GroupLayout(jPanelExcluir);
            jPanelExcluir.setLayout(jPanelExcluirLayout);
            jPanelExcluirLayout.setHorizontalGroup(
                jPanelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelExcluirLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelExcluir)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldValorExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonExcluir)
                    .addContainerGap(125, Short.MAX_VALUE))
            );
            jPanelExcluirLayout.setVerticalGroup(
                jPanelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelExcluirLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelExcluir)
                        .addComponent(jTextFieldValorExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluir))
                    .addContainerGap(344, Short.MAX_VALUE))
            );

            jTabbedPaneMenuPrincipal.addTab("Excluir", jPanelExcluir);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneMenuPrincipal)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPaneMenuPrincipal)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValorNomeDoPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorNomeDoPaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorNomeDoPaiActionPerformed

    private void jTextFieldValorDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorDataDeNascimentoActionPerformed

    private void jButtonAdicionarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTelefoneActionPerformed
        CadastroTelefone cadastro = new CadastroTelefone(this, true);
        cadastro.setVisible(true);
        if (cadastro.getTelefone() != null) {
            telefonesListModel.addElement(cadastro.getTelefone());
        }
        cadastro.dispose();
    }//GEN-LAST:event_jButtonAdicionarTelefoneActionPerformed

    private void jButtonRemoverTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTelefoneActionPerformed
        if (jListTelefones.getSelectedIndex() != -1) {
            telefonesListModel.removeElementAt(jListTelefones.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoverTelefoneActionPerformed

    private void jComboBoxValorSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValorSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValorSexoActionPerformed

    
    
    private void pesquisarJogadorDeBasquete(String nome) {
        JogadorDeBasquete jogadorDeBasquetePesquisado = controleJogadorDeBasquete.pesquisar(nome);

        if (jogadorDeBasquetePesquisado == null) {
            exibirInformacao("Jogador nao encontrado. ");
        } else {
            this.umJogadorDeBasquete = jogadorDeBasquetePesquisado;
            this.preencherCampos();
            this.habilitarDesabilitarCampos();
        }
    }
    
 
    
    private void jButtonAdicionarPremiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarPremiacaoActionPerformed
        CadastroPremiacao cadastro = new CadastroPremiacao(this, true);
        cadastro.setVisible(true);
        if (cadastro.getPremiacao() != null) {
            premiacaoListModel.addElement(cadastro.getPremiacao());
        }
        cadastro.dispose();
    }//GEN-LAST:event_jButtonAdicionarPremiacaoActionPerformed

    private void jButtonRemoverPremiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverPremiacaoActionPerformed
        if (jListPremiacoes.getSelectedIndex() != -1) {
            premiacaoListModel.removeElementAt(jListPremiacoes.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoverPremiacaoActionPerformed

    private void jTableListaJogadoresDeBasqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaJogadoresDeBasqueteMouseClicked
        if (jTableListaJogadoresDeBasquete.isEnabled()) {
            DefaultTableModel model = (DefaultTableModel) jTableListaJogadoresDeBasquete.getModel();
            String nome = (String) model.getValueAt(jTableListaJogadoresDeBasquete.getSelectedRow(), 0);
            this.pesquisarJogadorDeBasquete(nome);
        }
    }//GEN-LAST:event_jTableListaJogadoresDeBasqueteMouseClicked

    private void jTextFieldValorAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorAlturaActionPerformed

    private void jTextFieldValorAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorAlterarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       String alterar = jTextFieldValorAlterar.getText();
    if (jTextFieldValorAlterar != null) {
        jTabbedPaneMenuPrincipal.setSelectedComponent(this.jPanelNovo);
        this.pesquisarJogadorDeBasquete(alterar);
        modoAlteracao = true;
        novoRegistro = false;
        this.habilitarDesabilitarCampos();
        preencherCampos();
        
    }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
            String pesquisa = jTextFieldValorBuscar.getText();
    if (jTextFieldValorBuscar != null) {
            this.pesquisarJogadorDeBasquete(pesquisa);
            jTabbedPaneMenuPrincipal.setSelectedComponent(this.jPanelNovo);
            this.habilitarDesabilitarCampos();
    }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       String excluir = jTextFieldValorExcluir.getText();
    if (jTextFieldValorExcluir != null) {
        
        this.pesquisarJogadorDeBasquete(excluir);
        this.controleJogadorDeBasquete.remover(umJogadorDeBasquete);
        exibirInformacao("Jogador removido com sucesso. ");
        umJogadorDeBasquete = null;
        jTabbedPaneMenuPrincipal.setSelectedComponent(this.jPanelNovo);
    }
        this.limparCampos();
        this.carregarListaJogadoresDeBasquete();
        this.habilitarDesabilitarCampos();
     
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        this.salvarRegistro();
        jTabbedPaneMenuPrincipal.setSelectedComponent(this.jPanelNovo);
        exibirInformacao("Jogador cadastrado com sucesso. ");
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (novoRegistro == true) {
            this.limparCampos();
        } else {
            this.preencherCampos();
        }
        modoAlteracao = false;
        novoRegistro = false;
        exibirInformacao("Cancelamento realizado com sucesso. ");
        this.habilitarDesabilitarCampos();
        jTabbedPaneMenuPrincipal.setSelectedComponent(this.jPanelNovo);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldValorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorNomeActionPerformed
        
    }//GEN-LAST:event_jTextFieldValorNomeActionPerformed

    private void jPanelBuscarJogadorDeBasqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarJogadorDeBasqueteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelBuscarJogadorDeBasqueteMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        umJogadorDeBasquete = null;
        modoAlteracao = true;
        novoRegistro = true;
        this.limparCampos();
        this.habilitarDesabilitarCampos();
        this.jTextFieldValorNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarPremiacao;
    private javax.swing.JButton jButtonAdicionarTelefone;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRemoverPremiacao;
    private javax.swing.JButton jButtonRemoverTelefone;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxValorArremessoComBase;
    private javax.swing.JComboBox jComboBoxValorArremessoComGancho;
    private javax.swing.JComboBox jComboBoxValorArremessoGarrafao;
    private javax.swing.JComboBox jComboBoxValorArremessoLongo;
    private javax.swing.JComboBox jComboBoxValorArremessoMedio;
    private javax.swing.JComboBox jComboBoxValorArremessoTresPontos;
    private javax.swing.JComboBox jComboBoxValorAtitudeDeEquipe;
    private javax.swing.JComboBox jComboBoxValorBandeja;
    private javax.swing.JComboBox jComboBoxValorBloqueio;
    private javax.swing.JComboBox jComboBoxValorCompetitividade;
    private javax.swing.JComboBox jComboBoxValorDesarme;
    private javax.swing.JComboBox jComboBoxValorDominioDaBola;
    private javax.swing.JComboBox jComboBoxValorDrible;
    private javax.swing.JComboBox jComboBoxValorEnterrada;
    private javax.swing.JComboBox jComboBoxValorEstado;
    private javax.swing.JComboBox jComboBoxValorHabilidadeToco;
    private javax.swing.JComboBox jComboBoxValorHistoricoDeLesao;
    private javax.swing.JComboBox jComboBoxValorImpactoPressao;
    private javax.swing.JComboBox jComboBoxValorLanceLivre;
    private javax.swing.JComboBox jComboBoxValorLideranca;
    private javax.swing.JComboBox jComboBoxValorMaoDominante;
    private javax.swing.JComboBox jComboBoxValorPassePeito;
    private javax.swing.JComboBox jComboBoxValorPasseQuicado;
    private javax.swing.JComboBox jComboBoxValorPosicao;
    private javax.swing.JComboBox jComboBoxValorReboteDefensivo;
    private javax.swing.JComboBox jComboBoxValorReboteOfensivo;
    private javax.swing.JComboBox jComboBoxValorResistencia;
    private javax.swing.JComboBox jComboBoxValorSensoDeQuadra;
    private javax.swing.JComboBox jComboBoxValorSexo;
    private javax.swing.JLabel jLabelAceleracao;
    private javax.swing.JLabel jLabelAlterar;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelApelido;
    private javax.swing.JLabel jLabelArremessoComBase;
    private javax.swing.JLabel jLabelArremessoComGancho;
    private javax.swing.JLabel jLabelArremessoGarrafao;
    private javax.swing.JLabel jLabelArremessoLongo;
    private javax.swing.JLabel jLabelArremessoMedio;
    private javax.swing.JLabel jLabelArremessoTresPontos;
    private javax.swing.JLabel jLabelAtitudeDeEquipe;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBandeja;
    private javax.swing.JLabel jLabelBloqueio;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCOmpetitividade;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataDeNascimento;
    private javax.swing.JLabel jLabelDesarme;
    private javax.swing.JLabel jLabelDominioDaBola;
    private javax.swing.JLabel jLabelDrible;
    private javax.swing.JLabel jLabelEnterrada;
    private javax.swing.JLabel jLabelEnvergadura;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelHabilidadeToco;
    private javax.swing.JLabel jLabelHabilidades;
    private javax.swing.JLabel jLabelHistoricoDeLesao;
    private javax.swing.JLabel jLabelImpactoPressao;
    private javax.swing.JLabel jLabelImpulso;
    private javax.swing.JLabel jLabelLanceLivre;
    private javax.swing.JLabel jLabelLideranca;
    private javax.swing.JLabel jLabelListaJogadoresDeBasquete;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelMaoDominante;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeDaMae;
    private javax.swing.JLabel jLabelNomeDoPai;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroDaCamisa;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPassePeito;
    private javax.swing.JLabel jLabelPasseQuicado;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelPosicao;
    private javax.swing.JLabel jLabelPremiacoes;
    private javax.swing.JLabel jLabelReboteDefensivo;
    private javax.swing.JLabel jLabelReboteOfensivo;
    private javax.swing.JLabel jLabelResistencia;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSensoDeQuadra;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefones;
    private javax.swing.JLabel jLabelTempoDeReacao;
    private javax.swing.JList jListPremiacoes;
    private javax.swing.JList jListTelefones;
    private javax.swing.JPanel jPanelAlterar;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelBuscarJogadorDeBasquete;
    private javax.swing.JPanel jPanelCaracteristicasFisicas;
    private javax.swing.JPanel jPanelCaracteristicasPsicologicas;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelExcluir;
    private javax.swing.JPanel jPanelFichaTecnica;
    private javax.swing.JPanel jPanelInformacoesGerais;
    private javax.swing.JPanel jPanelLIstarTodos;
    private javax.swing.JPanel jPanelNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneMenuPrincipal;
    private javax.swing.JTabbedPane jTabbedPanelCadastro;
    private javax.swing.JTable jTableListaJogadoresDeBasquete;
    private javax.swing.JTextField jTextFieldValorAceleracao;
    private javax.swing.JTextField jTextFieldValorAlterar;
    private javax.swing.JTextField jTextFieldValorAltura;
    private javax.swing.JTextField jTextFieldValorApelido;
    private javax.swing.JTextField jTextFieldValorBairro;
    private javax.swing.JTextField jTextFieldValorBuscar;
    private javax.swing.JTextField jTextFieldValorCep;
    private javax.swing.JTextField jTextFieldValorCidade;
    private javax.swing.JTextField jTextFieldValorComplemento;
    private javax.swing.JTextField jTextFieldValorCpf;
    private javax.swing.JTextField jTextFieldValorDataDeNascimento;
    private javax.swing.JTextField jTextFieldValorEnvergadura;
    private javax.swing.JTextField jTextFieldValorExcluir;
    private javax.swing.JTextField jTextFieldValorImpulso;
    private javax.swing.JTextField jTextFieldValorLogradouro;
    private javax.swing.JTextField jTextFieldValorNome;
    private javax.swing.JTextField jTextFieldValorNomeDaMae;
    private javax.swing.JTextField jTextFieldValorNomeDoPai;
    private javax.swing.JTextField jTextFieldValorNumero;
    private javax.swing.JTextField jTextFieldValorNumeroDaCamisa;
    private javax.swing.JTextField jTextFieldValorPais;
    private javax.swing.JTextField jTextFieldValorPeso;
    private javax.swing.JTextField jTextFieldValorRg;
    private javax.swing.JTextField jTextFieldValorTempoDeReacao;
    // End of variables declaration//GEN-END:variables
}
