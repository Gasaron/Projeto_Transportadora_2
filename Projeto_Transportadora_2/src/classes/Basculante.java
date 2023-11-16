package classes;

public class Basculante extends Caminhao{
    public Basculante(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                    String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao){
        super(placa,tipoCombustivel,fabricante,numeroChassis,cor,tipoVeiculo,modelo,anoFabricacao,anoModelo,tipoCaminhao);

    }

    public String mostrarDados(){
        return "Tipo Veiculo: " + this.tipoCaminhao +
                "\nTipo Caminhao: " + this.tipoCaminhao +
                "\nFabricante: " + this.fabricante +
                "\nPlaca: " + this.placa +
                "\nCombustivel: " + this.tipoCombustivel +
                "\nAno Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nAno do Modelo: " + this.anoModelo +
                "\nCor: " + this.cor +
                "\nNúmero de chassi: " + this.numeroChassis +
                "\n****************************************\n";
    }
}
