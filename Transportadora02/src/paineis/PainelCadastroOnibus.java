package paineis;

import classes.Veiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastroOnibus extends JPanel {

    private JLabel jlOnibus, jlFabricante, jlAnoModelo, jlAnoFabricacao,
            jlModelo, jlCor, jlNumeroPoltronas, jlChassi, jlPlaca, jlCombustivel;

    private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao,
            jtfModelo, jtfCor, jtfChassi, jtfPlaca;

    private JRadioButton jrbPoltronas42, jrbPoltronas32, jrbPoltronas25, jrbGasolina,
            jrbAlcool, jrbGasolinaAlcool, jrbDiesel;

    private BottonGroup bgNumeroPoltronas, bgCombustiveis;

    private JButton jbCadastrar;

    private List<Veiculos>veiculos;

    public PainelCadastroOnibus(List<Veiculos>veiculos) {
        super();
        setSize(400,400);
        setLayout(null);
        setBackground(Color.white);
        this.veiculos = veiculos;
        iniciarComponentes();
        criarEventos();

        private void iniciarComponentes() {
//        objetos

            jlOnibus = new JLabel("Onibus");
            jlFabricante = new JLabel("Fabricante");
            jlAnoModelo = new JLabel("Anp/Modelo");
            jlAnoFabricacao = new JLabel("Ano/Fabricaçao");
            jlModelo = new JLabel("Modelo");
            jlCor = new JLabel("Cor");
            jlNumeroPoltronas = new JLabel("Numero de Poltronas");
            jlChassi = new JLabel("Chassi");
            jlPlaca = new JLabel("Placa");
            jlCombustivel = new JLabel();
            jtfFabricante = new JTextField();
            jtfAnoFabricacao = new JTextField();
            jtfAnoModelo = new JTextField();
            jtfModelo = new JTextField();
            jtfCor = new JTextField();
            jtfChassi = new JTextField();
            jtfPlaca = new JTextField();
            jrbPoltronas42 = new JRadioButton("42", true);
            jrbPoltronas42.setOpaque(false);
            jrbPoltronas32 = new JRadioButton("32");
            jrbPoltronas32.setOpaque(false);
            jrbPoltronas25 = new JRadioButton("25");
            jrbPoltronas25.setOpaque(false);
            bgNumeroLugares = new BottonGroup();
            jrbGasolina = new JRadioButton("Gasolina", true);
            jrbGasolina.setOpaque(false);
            jrbAlcool = new JRadioButton("Álcool");
            jrbAlcool.setOpaque(false);
            jrbDiesel = new JRadioButton("Diesel");
            jrbDiesel.setOpaque(false);
            jrbGasolinaAlcool = new JRadioButton("Gasolina/Álcool");
            jrbGasolinaAlcool.setOpaque(false);
            bgCombustiveis = new BottonGroup();
            jbCadastrar = new JButton("CADASTRAR");

            //        ADICIONAR OBJETOS
            add(jlFabricante);
            add(jlAnoModelo);
            add(jlOnibus);
            add(jlAnoFabricacao);
            add(jlModelo);
            add(jlCor);
            add(jlNumeroPoltronas);
            add(jlCombustivel);
            add(jtfFabricante);
            add(jtfAnoFabricacao);
            add(jtfAnoModelo);
            add(jtfModelo);
            add(jtfCor);
            add(jrbPoltronas25);
            add(jrbPoltronas32);
            add(jrbPoltronas42);
            add(jlChassi);
            add(jlPlaca);
            add(jtfChassi);
            add(jtfPlaca);
            add(jrbDiesel);
            add(jrbGasolina);
            add(jrbAlcool);
            add(jrbGasolinaAlcool);

            jrbGasolinaAlcool.setBounds(20,230,120,20);
            jrbDiesel.setBounds(150,210,100,20);
            jrbAlcool.setBounds(150,230,100,20);
            jrbGasolina.setBounds(250,210,110,40);
            jtfPlaca.setBounds(250,210,110,40);
            jlChassi.setBounds(20,230,120,20);
            jrbPoltronas25.setBounds(20,230,120,20);
            jrbPoltronas32.setBounds(20,230,120,20);
            jrbPoltronas42.setBounds(20,230,120,20);
            jtfCor.setBounds(20,230,120,20);
            jtfAnoModelo.setBounds(20,230,120,20);
            jtfAnoFabricacao.setBounds(20,230,120,20);
            jtfFabricante.setBounds(20,230,120,20);
            jlCombustivel.setBounds(20,230,120,20);
            jlNumeroPoltronas.setBounds(150,210,100,20);
            jlCor.setBounds(150,230,100,20);
            jlModelo.setBounds(250,210,110,40);
            jlAnoFabricacao.setBounds(250,210,110,40);
            jlOnibus.setBounds(20,230,120,20);
            jlAnoModelo.setBounds(20,230,120,20);
            jlFabricante.setBounds(20,230,120,20);

            private void CriarEventos(){
                //Evento do botão cadastrar

                jbCadastrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Validando Campos

                        if (!jtfFabricante.getText().isEmpty() &&
                                !jtfAnoModelo.getText().isEmpty() &&
                                !jtfAnoFabricacao.getText().isEmpty() &&
                                !jtfModelo.getText().isEmpty() &&
                                !jtfCor.getText().isEmpty() &&
                                !jtfChassi.getText().isEmpty() &&
                                !jtfPlaca.getText().isEmpty()) {

                            //Variaveis
                            String fabricante, anoModelo, anoFabricacao,
                                    modelo, cor, numeroChasi, tipoVeiculo,
                                    tipoCombustivel = null,placa;
                            int QuantidadeLugares= 0;

                            //Entradas
                            fabricante = jtfFabricante.getText();
                            anoModelo = jtfAnoModelo.getText();
                            anoFabricacao = jtfAnoFabricacao.getText();
                            modelo = jtfModelo.getText();
                            cor = jtfCor.getText();
                            numeroChasi = jtfChassi.getText();
                            placa= jtfPlaca.getText();
                            tipoVeiculo = jlOnibus.getText();

                            //Entrade de quantidades de lugares
                            if(jrbPoltronas25).isSelected()) quantidadeLugares = 25;
                            if(jrbPoltronas32).isSelected()) quantidadeLugares = 32;
                            if(jrbPoltronas42).isSelected()) quantidadeLugares = 42;


                            //Entrade de quantidades de lugares
                            if(jrbGrande).isSelected()) quantidadeLugares = 7;
                            if(jrbMedio).isSelected()) quantidadeLugares = 5;
                            if(jrbPequeno).isSelected()) quantidadeLugares = 4;

//Combustivel
                            if(jrbGasolina).isSelected()) quantidadeLugares = "Gasolina";
                            if(jrbGasolinaAlcool).isSelected()) quantidadeLugares = "Gasolina/Alcool";
                            if(jrbAlcool).isSelected()) quantidadeLugares = "Alcool";
                            if(jrbDiesel).isSelected()) quantidadeLugares = "Diesel";

                            veiculos.add(new Carro (placa, tipoCombustivel, fabricante,
                                    numeroChasi, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, quantidadeLugares));

                            jtfFabricante.setText("");
                            jtfAnoModelo.setText("");
                            jtfAnoFabricacao.setText("");
                            jtfModelo.setText("");
                            jtfCor.setText("");
                            jtfChassi.setText("");
                            jtfPlaca.setText("");

                        }else{
                            JOptionPane.showMessageDialog(null, "Preencha os Campos",
                                    "Transpordadora" JOptionPane.ERROR_MESSAGE);

                        }

                    }
            });
//Eventos Atualizar Dados
            jbCadastrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

        }
    }

    private void criarEventos() {
    }
}

    private void iniciarComponentes() {
    }

    public void preencherDados() {
    }



