package paineis;

import classes.Veiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelPesquisa extends JPanel {
    private List<Veiculos> veiculos;
    private JButton jbPesquisa;
    private JLabel jlPlaca;
    private  JTextField jtfPlaca;
    private JTextArea jtaMostrar;

//    Construtor

    public PainelPesquisa(List<Veiculos> veiculos) {
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.lightGray);
        this.veiculos = veiculos;
        iniciarComponentes();
        criarEventos();

    }
    private void iniciarComponentes() {
//        obj
        jbPesquisa = new JButton("Pesquisa");
        jlPlaca = new JLabel("Placa");
        jtfPlaca = new JTextField();

        jtaMostrar = new JTextArea();
        add(jbPesquisa);
        add(jlPlaca);
        add(jtfPlaca);
        add(jtaMostrar);

//        dimensionar
        jbPesquisa.setBounds(140,20,100,20);
        jlPlaca.setBounds(140,60,100,20);
        jtfPlaca.setBounds(140,80,100,20);
        jtaMostrar.setBounds(30,120,330,200);

    }

    private void criarEventos() {
        jbPesquisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean achou = false;
                for (Veiculos veiculo : veiculos) {
                    if (veiculo.getPlaca().equals(jtfPlaca.getText())) {
                        jtaMostrar.append((veiculos.indexOf(veiculo)+1)+"-\n"+ veiculo.mostrarDados());
                        achou=true;
                    }
                }
                if (!achou) {
                    JOptionPane.showMessageDialog(null,"Veiculo Inexistente!",
                            "Transportadora", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
