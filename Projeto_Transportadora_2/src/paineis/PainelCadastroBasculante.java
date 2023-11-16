package paineis;

import classes.Veiculos;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PainelCadastroBasculante extends JPanel {

    private JLabel jlBasculante, jlFabricante, jlAnoModelo, jlAnoFabricacao, jlModelo, jlCor, jlChassi, jlPlaca, jlCombustivel;
    private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao, jtfModelo, jtfCor, jtfChassi, jtfPlaca;
    private JRadioButton jrbGasolina, jrbAlcool, jrbGasolinaAlcool, jrbDiesel;
    private ButtonGroup bgCombustiveis;
    private JButton jbCadastrar;

    public PainelCadastroBasculante(List<Veiculos> veiculos){
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.magenta);
        this.veiculos = veiculos;
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes(){
        jlBasculante = new JLabel("Basculante");
        jlFabricante = new JLabel("Fabricante");
        jlAnoModelo = new JLabel("Ano/Modelo");
        jlAnoFabricacao = new JLabel("Ano/Fabricação");
        jlModelo = new JLabel("Modelo");
        jlCor = new JLabel("Cor");
        jlChassi = new JLabel("Chassi");
        jlPlaca = new JLabel("Placa");
        jlCombustivel = new JLabel("Combustíveis");
        jtfFabricante = new JTextField();
        jtfAnoFabricacao = new JTextField();
        jtfAnoModelo = new JTextField();
        jtfModelo = new JTextField();
        jtfCor = new JTextField();
        jtfChassi = new JTextField();
        jtfPlaca = new JTextField();
        jrbGasolina = new JRadioButton("Gasolina", true);
        jrbGasolina.setOpaque(false);
        jrbAlcool = new JRadioButton("Alcool");
        jrbAlcool.setOpaque(false);
        jrbGasolinaAlcool = new JRadioButton("Gasolina/Alcool");
        jrbGasolinaAlcool.setOpaque(false);
        jrbDiesel = new JRadioButton("Diesel");
        jrbDiesel.setOpaque(false);
        bgCombustiveis = new ButtonGroup();
        jbCadastrar = new JButton("CADASTRAR");

        add(jlFabricante);
        add(jlAnoModelo);
        add(jlBasculante);
        add(jlAnoFabricacao);
        add(jlModelo);
        add(jlCor);
        add(jlCombustivel);
        add(jtfFabricante);
        add(jtfAnoFabricacao);
        add(jtfAnoModelo);
        add(jtfModelo);
        add(jtfCor);
        add(jlChassi);
        add(jlPlaca);
        add(jtfChassi);
        add(jtfPlaca);
        add(jrbGasolina);
        add(jrbGasolinaAlcool);
        add(jrbAlcool);
        add(jrbDiesel);
        add(jbCadastrar);

        bgCombustiveis.add(jrbGasolina);
        bgCombustiveis.add(jrbGasolinaAlcool);
        bgCombustiveis.add(jrbAlcool);
    }
}
