package telas;

import arquivos.LerEscrverArquivo;
import classes.Veiculos;
import paineis.*;

import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class TelaTransportadora extends JFrame {

    private Container contentPane;
    private JMenuBar jmbBarra;
    private JMenu jmArquivo, jmCadastro, jmSobre, jmCaminhao, jmExibir;
    private JMenuItem jmiSair, jmiCarro, jmiOnibus,jmiCaminhao,
    jmiBasculante, jmiCarreta, jmiBau, jmiMostrarDados, jmiPesquisa, jmiDelete, jmiAlterar;
    private List<Veiculos> veiculos = new ArrayList<>();

    LerEscrverArquivo arquivo = new LerEscrverArquivo();

    public TelaTransportadora(String title) throws HeadlessException {
        super(title);
        setSize(400,400);
        getContentPane().setBackground(Color.CYAN);
        abrirArquivo();
        iniciarComponentes();
        criarEventos();
        setLocationRelativeTo(getContentPane());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    private void abrirArquivo() {
        if (arquivo.lerArquivo() != null) {
            veiculos = arquivo.lerArquivo();
        }
    }
    private void iniciarComponentes(){
        contentPane = getContentPane();
        jmbBarra = new JMenuBar();
        setJMenuBar(jmbBarra);
        jmArquivo = new JMenu("Arquivo");
        jmArquivo.setMnemonic('A');
        jmCadastro = new JMenu("Cadastro");
        jmCadastro.setMnemonic('C');
        jmExibir = new JMenu("Exibir");
        jmExibir.setMnemonic('E');
        jmCadastro = new JMenu("Cadastro");
        jmCadastro.setMnemonic('C');
        jmCaminhao = new JMenu("Caminhao");
        jmSobre = new JMenu("Sobre");
        jmSobre.setMnemonic('S');
        jmiSair = new JMenuItem("Sair");
        jmiSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ALT_MASK));
        jmiCarro = new JMenuItem("Carro");
        jmiOnibus = new JMenuItem("Onibus");
        jmiBasculante = new JMenuItem("Basculante");
        jmiCaminhao = new JMenuItem("Caminhao");
        jmiCarreta = new JMenuItem("Carreta");
        jmiBau = new JMenuItem("Bau");
        jmiMostrarDados = new JMenuItem("Mostrar dados");
        jmiPesquisa = new JMenuItem("Pesquisa");
        jmiDelete = new JMenuItem("Deletar");
        jmiAlterar = new JMenuItem("Alterar");

        jmbBarra.add(jmArquivo);
        jmbBarra.add(jmCadastro);
        jmbBarra.add(jmExibir);
        jmbBarra.add(jmSobre);

        jmArquivo.add(jmiSair);
        jmCadastro.add(jmiCarro);
        jmCadastro.add(jmiOnibus);
        jmCadastro.add(jmiCaminhao);
        jmCaminhao.add(jmiBasculante);
        jmCaminhao.add(jmiCarreta);
        jmCaminhao.add(jmiBau);
        jmExibir.add(jmiMostrarDados);
        jmExibir.add(jmiPesquisa);
        jmExibir.add(jmiDelete);
        jmExibir.add(jmiAlterar);
    }
    private void criarEventos(){
        jmiSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(null,
                        "Desejaria salvar e sair do programa?");
                if (resposta==0) {//0 = "sim"
                    arquivo.escreverArquivo(veiculos);
                }
                System.exit(0);


            }
        });
        jmiCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PainelCadastroCarro carro = new PainelCadastroCarro(veiculos);
                contentPane.removeAll();;
                contentPane.add(carro);
                contentPane.validate();
            }
        });

        jmiMostrarDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelMostrarDados dados = new PainelMostrarDados(veiculos);
                contentPane.removeAll();;
                contentPane.add(dados);
                contentPane.validate();
            }
        });

        jmiOnibus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCadastroOnibus onibus = new PainelCadastroOnibus(veiculos);
                contentPane.removeAll();;
                contentPane.add(onibus);
                contentPane.validate();
            }
        });

        jmiBasculante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCadastroBasculante basculante = new PainelCadastroBasculante(veiculos);
                contentPane.removeAll();;
                contentPane.add(basculante);
                contentPane.validate();
            }
        });

        jmiPesquisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelPesquisa pesquisa = new PainelPesquisa(veiculos);
                contentPane.removeAll();;
                contentPane.add(pesquisa);
                contentPane.validate();
            }
        });

        jmiDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelDeletarCadastro deletar = new PainelDeletarCadastro(veiculos);
                contentPane.removeAll();;
                contentPane.add(deletar);
                contentPane.validate();
            }
        });

        jmiAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCadastroCarro carro = new PainelCadastroCarro(veiculos);
                PainelCadastroOnibus onibus = new PainelCadastroOnibus(veiculos);
                onibus.preencherDados();
                carro.preencherDados();
                contentPane.removeAll();;
                contentPane.add(carro);
                contentPane.add(onibus);
                contentPane.validate();
            }
        });
    }

    private class ALT_MASK {
    }
}
