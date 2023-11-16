package classes;

public class Onibus extends Veiculos{
    private int quantidadePoltronas;

    public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                 String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int quantidadePoltronas){

        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);

        this.quantidadePoltronas = quantidadePoltronas;
    }

    public String mostrarDados(){
        return "Tipo Veiculo: " + this.tipoVeiculo +
                "\nFabricante: " + this.fabricante +
                "\nPlaca: " + this.placa +
                "\nCombustivel: " + this.tipoCombustivel +
                "\nAno Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nAno do Modelo: " + this.anoModelo +
                "\nCor: " + this.cor +
                "\nQuantidade de Lugares: " + this.quantidadePoltronas +
                "\nNúmero de chassi: " + this.numeroChassis +
                "\n****************************************\n";
    }
}
