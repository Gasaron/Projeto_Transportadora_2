package classes;

public class Caminhao extends Veiculos{

    protected String tipoCaminhao;
    public Caminhao(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                    String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao){
        super(placa,tipoCombustivel,fabricante,numeroChassis,cor,tipoVeiculo,modelo,anoFabricacao,anoModelo);
        this.tipoCaminhao = tipoCaminhao;
    }

    public String mostrarDados(){
        return "Combustivel: " + this.tipoCombustivel +
                "\nAno Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nAno do Modelo: " + this.anoModelo +
                "\nCor: " + this.cor +
                "\nNúmero de chassi: " + this.numeroChassis +
                "\n****************************************\n";
    }
}
