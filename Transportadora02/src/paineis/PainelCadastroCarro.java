package paineis;

import classes.Veiculos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastroCarro extends JPanel {

    private JLabel jlCarro, jlFabricante, jlAnoModelo, jlAnoFabricacao,
    jlModelo, jlCor, jlNumeroLugares, jlChassi, jlPlaca, jlCombustivel;

    private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFabricacao,
    jtfModelo, jtfCor, jtfChassi, jtfPlaca;

    private JRadioButton jrbGrande, jrbMedio, jrbPequeno, jrbGasolina,
    jrbAlcool, jrbGasolinaAlcool, jrbDiesel;

    private BottonGroup bgNumeroLugares, bgCombustiveis;

    private JButton jbCadastrar, jbAtualizar;

    private List<Veiculos>veiculos;

    private void iniciarComponentes() {
//        objetos

        jlCarro = new JLabel("Carro");
        jlFabricante = new JLabel("Fabricante");
        jlAnoModelo = new JLabel("Anp/Modelo");
        jlAnoFabricacao = new JLabel("Ano/Fabricaçao");
        jlModelo = new JLabel("Modelo");
        jlCor = new JLabel("Cor");
        jlNumeroLugares = new JLabel("Numero de Lugares");
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
        jrbGrande = new JRadioButton("7", true);
        jrbGrande.setOpaque(false);
        jrbPequeno = new JRadioButton("5");
        jrbPequeno.setOpaque(false);
        jrbMedio = new JRadioButton("4");
        jrbMedio.setOpaque(false);
        bgNumeroLugares = new BottonGroup();
        jrbGasolina = new JRadioButton("Gasolina", true);
        jrbGasolina.setOpaque(false);
        jrbAlcool = new JRadioButton("Álcool");
        jrbAlcool.setOpaque(false);
        jrbDiesel = new JRadioButton("Diesel");
        jrbDiesel.setOpaque(false);
        jrbGasolinaAlcool = new JRadioButton("Gasolina/Álcool");
        jrbGasolinaAlcool.setOpaque(false);


        public PainelCadastroCarro(List<Veiculos>veiculos) {
            super();
            setSize(400,400);
            setLayout(null);
            setBackground(Color.gray);
            this.veiculos = veiculos;
            iniciarComponentes();
            criarEventos();

        }
        public void preencherDados(){
            jbCadastrar.setVisible(true);
            int indice = integer.parseInt(JOptionPane.showMessageDialog("Entre Com Indice"));
            jtfAnoFabricacao.setText(veiculos.get(indice).getAnoFabricacao());
            jtfAnoModelo.setText(veiculos.get(indice).getAnoModelo());
            jtfChassi.setText(veiculos.get(indice).getChassi());
            jtfCor.setText(veiculos.get(indice).getCor());
            jtfFabricante.setText(veiculos.get(indice).getFabricante());
            jtfModelo.setText(veiculos.get(indice).getModelo());
            jtfPlaca.setText(veiculos.get(indice).getPlaca());
            if(veiculos.get(indice).getTipoCombustivel().equals("Gasolina"))
                jrbGasolina.setSelected(true);
            if(veiculos.get(indice).getTipoCombustivel().equals("Alcool"))
                jrbAlcool.setSelected(true);
            if(veiculos.get(indice).getTipoCombustivel().equals("Gasolina/Álcool"))
                jrbGasolinaAlcool.setSelected(true);
            if(veiculos.get(indice).getTipoCombustivel().equals("Diesel"))
                jrbDiesel.setSelected(true);

            private void iniciarComponentes() {

//                Objetos

        jrbGasolinaAlcool.setOpaque(false);
        jrbAlcool = new JRadioButton("Diesel");
        jrbDiesel.setOpaque(false);
        bgCombustiveis = new BottonGroup();
        jbCadastrar = new JButton("CADASTRAR");
        jbAtualizar = new JButton("ATUALIZAR");

//        ADICIONAR OBJETOS
                add(jlFabricante);
                add(jlAnoModelo);
                add(jlCarro);
                add(jlAnoFabricacao);
                add(jlModelo);
                add(jlCor);
                add(jlNumeroLugares);
                add(jlCombustivel);
                add(jtfFabricante);
                add(jtfAnoFabricacao);
                add(jtfAnoModelo);
                add(jtfModelo);
                add(jtfCor);
                add(jrbGrande);
                add(jrbMedio);
                add(jrbPequeno);
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
                jrbPequeno.setBounds(20,230,120,20);
                jrbMedio.setBounds(20,230,120,20);
                jrbGrande.setBounds(20,230,120,20);
                jtfCor.setBounds(20,230,120,20);
                jtfAnoModelo.setBounds(20,230,120,20);
                jtfAnoFabricacao.setBounds(20,230,120,20);
                jtfFabricante.setBounds(20,230,120,20);
                jlCombustivel.setBounds(20,230,120,20);
                jlNumeroLugares.setBounds(150,210,100,20);
                jlCor.setBounds(150,230,100,20);
                jlModelo.setBounds(250,210,110,40);
                jlAnoFabricacao.setBounds(250,210,110,40);
                jlCarro.setBounds(20,230,120,20);
                jlAnoModelo.setBounds(20,230,120,20);
                jlFabricante.setBounds(20,230,120,20);




            }

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
                    tipoVeiculo = jlCarro.getText();

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
            });
//Eventos Atualizar Dados
        jbAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        }
    }

    private void criarEventos() {
    }

    public void preencherDados() {
    }
}



























