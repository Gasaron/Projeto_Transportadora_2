package paineis;
import classes.*;
import classes.Basculante;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class PainelCadastroBasculante extends JPanel {
    private final List veiculos;
    private JLabel jlBuscalante, jlFabricante, jlAnoModelo, jlAnoFabricante,
    jlModelo, jlCor, jlChassi, jlPlaca, jlCombustivel;

    private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao,
            jtfModelo, jtfCor, jtfChassi, jtfPlaca;
    private JRadioButton jrbGasolina, jrbAlccol, jrbGasolinaAlcool, jrbDiesel;
private ButtonGroup bgCombustiveis;
    private Object jbCadastrar;

    //Construtor
    public PainelCadastroBasculante(List veiculos) {
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.CYAN);
        this.veiculos = veiculos;  
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
//        objetos
        jlBuscalante = new JLabel("Basculante");
        jlFabricante = new JLabel("Fabricante");
        jlAnoModelo = new JLabel("Ano/Modelo");
        jlAnoFabricante = new JLabel("Ano/Fabricação");
        jlModelo = new JLabel("Modelo");
        jlCor = new JLabel("Cor");
        jlChassi = new JLabel("Chassi");
        jlPlaca = new JLabel("Placa");
        jlCombustivel = new JLabel("Combustivel");
        jlCor = new JLabel("Cor");
        jtfFabricante = new JTextField();
        jtfAnoFabricacao = new JTextField();
        jtfAnoModelo = new JTextField();
        jtfModelo = new JTextField();
        jtfCor = new JTextField();
        jtfChassi = new JTextField();
        jtfPlaca = new JTextField();
        jrbGasolina = new JRadioButton("Gasolina, true");
        jrbGasolina.setOpaque(false);
        jrbAlccol = new JRadioButton("Alcool/Gasolina");
        jrbGasolina.setOpaque(false);
        jrbDiesel = new JRadioButton("Diesel");
        jrbDiesel.setOpaque(false);
        bgCombustiveis = new ButtonGroup();
        JButton jbCadastrar = new JButton ("CADASTRAR");

//        Adicionar Objetos
        add(jlFabricante);
        add(jlAnoModelo);
        add(jlBuscalante);
        add(jlFabricante);
        add(jlAnoFabricante);
        add(jlModelo);
        add(jlCor);
        add(jlCombustivel);
        add(jtfAnoFabricacao);
        add(jtfFabricante);
        add(jtfAnoModelo);
        add(jtfModelo);
        add(jtfCor);
        add(jlChassi);
        add(jlPlaca);
        add(jrbAlccol);
        add(jrbGasolinaAlcool);
        add(jrbDiesel);
        add(jbCadastrar);

        bgCombustiveis.add(jrbGasolina);
        bgCombustiveis.add(jrbGasolinaAlcool);

//        Dimensionar Componentes
        jlBuscalante.setBounds(170,10,80,20);
        jlFabricante.setBounds(20,40,100,20);
        jtfFabricante.setBounds(20,60,100,20);
        jlAnoModelo.setBounds(140,40,100,20);
        jtfAnoModelo.setBounds(180,60,500,20);
        jlFabricante.setBounds(200, 80,100,20);
        jtfFabricante.setBounds(180,100,130,20);
        jtfAnoFabricacao.setBounds(290,120,140,20);
        jlModelo.setBounds(290,120,140,20);
        jtfModelo.setBounds(290,120,140,20);
        jlCor.setBounds(290,120,140,20);
        jtfCor.setBounds(290,120,140,20);
        jlChassi.setBounds(290,120,140,20);
        jtfChassi.setBounds(290,120,140,20);
        jlPlaca.setBounds(290,120,140,20);
        jtfPlaca.setBounds(290,120,140,20);
        jlCombustivel.setBounds(290,120,140,20);
        jrbGasolina.setBounds(290,120,140,20);
        jrbGasolinaAlcool.setBounds(290,120,140,20);
        jrbAlccol.setBounds(290,120,140,20);
        jrbDiesel.setBounds(290,120,140,20);
        jbCadastrar.setBounds(290,120,140,20);

    }

    private void criarEventos() {
//        Evento do botão cadastrar

        jbCadastrar.toString();

    }
}
