package paineis;

import classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelMostrarDados extends JPanel {

    private JButton jbCarro, jbOnibus, jbCaminhao;
    private JCheckBox jckBau, jckBasculante, jckCarreta;
    private JScrollPane jsMostrar;
    private List<Veiculos> veiculos = null;

    public PainelMostrarDados(List<Veiculos> veiculos) {
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.black);
        this.veiculos = veiculos;
        iniciarComponetes();
        criarEventos();
    }
    private void iniciarComponetes(){
//        Obj
        jbCarro = new JButton("Carro");
        jbOnibus = new JButton("Onibus");
        jbCaminhao = new JButton("Caminhão");
        jckBasculante = new JCheckBox("Basculante");
        jckBasculante.setOpaque(false);
        jckCarreta = new JCheckBox("Carreta");
        jckCarreta.setOpaque(false);
        JTextArea jtaMostrar = new JTextArea();
        jsMostrar = new JScrollPane(jtaMostrar);

//        Adc
        add(jbCarro);
        add(jbCaminhao);
        add(jbOnibus);
        add(jckBasculante);
        add(jckBau);
        add(jsMostrar);
// dimensionar
        jbCarro.setBounds(20,20,100,20);
        jbOnibus.setBounds(20,60,100,20);
        jbCaminhao.setBounds(220,20,100,20);
        jckBau.setBounds(220,40,100,20);
        jckCarreta.setBounds(220,60,100,20);
        jckBasculante.setBounds(220,80,100,20);
        jsMostrar.setBounds(20,120,320,200);
    }
    private void criarEventos() {
        jbCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("******CADASTRO CARROS******\n");

                for (Veiculos veiculo : veiculos) {
                    if (veiculo instanceof Carro) {
                        jtaMostrar.append(veiculo.mostrarDados());
                    }
                }
            }
        });
//        botão de onibus
        jbOnibus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("******CADASTRO ONIBUS******\n");

                for (Veiculos veiculo : veiculos) {
                    if (veiculo instanceof Onibus) {
                        jtaMostrar.append(veiculo.mostrarDados());
                    }
                }
            }
        });
        return jbCaminhao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("******CADASTRO CAMINHÃO******\n");

                for (Veiculos veiculo : veiculos) {
                    if (veiculo instanceof Caminhao) {
                        jtaMostrar.append(veiculo.mostrarDados());
                    }
                }
                if (jckCarreta.isSelected()) {
                    if (veiculo instanceof Carreta) {
                        jtaMostrar.append(veiculo.mostrarDados());
                    }
                }
                if (jckBau.isSelected()) {
                    if (veiculo instanceof Bau) {
                        jtaMostrar.append(veiculo.mostrarDados());
                    }
                }
            }
        });