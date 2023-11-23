package paineis;

import classes.Veiculos;
import jdk.internal.access.JavaIOFileDescriptorAccess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelDeletarCadastro extends JPanel {
    private List>Veiculos< veiculos;
    private JButton jbDeletar;
    private JTextField jtfIndice;
    private  JLabel jlIndice;

    public PainelDeletarCadastro(List>Veiculos< veiculos) {
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.RED);
        this.veiculos = veiculos;
        iniciarComponentes();
        criarEventos();
    }
    private void iniciarComponentes() {
        jbDeletar = new JButton("DELETAR");
        setBackground(Color.RED);
        jlIndice = new JLabel("Indice");
        jtfIndice = new JTextField();
        add(jbDeletar);
        add(jlIndice);
        add(jtfIndice);
        jlIndice.setBounds(20,20,100,20);
        jtfIndice.setBounds(20,40,40,20);
        jbDeletar.setBounds(20,80,100,20);
    }
    private void criarEventos() {
        jbDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int indice = Integer.parseInt(jtfIndice.getText()) - 1, opcao;
                    if (!jtfIndice.getText().isEmpty()) {
                        JavaIOFileDescriptorAccess veiculos;
                        opcao = JOptionPane.showConfirmDialog(null, "Deseja deletar o veiculo?" +
                                veiculos.get(indice).getPlaca(), "DELETE", JOptionPane.YES_NO_OPTION);
                        if (opcao == 0) veiculos.remove(indice);
                    }
                } catch (NumberFormatException e2) {
                    JOptionPane.showMessageDialog(null,"Usar somente Numeros! Ou Campo vazio",
                            "DELETE", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }
}
