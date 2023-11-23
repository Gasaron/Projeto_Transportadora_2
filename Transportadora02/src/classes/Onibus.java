package classes;

public class Onibus extends Veiculos{
    private int QuantidadePoltronas;


//    construtor

    public Onibus(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                 String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int QuantidadePoltronas) {
        super( placa, tipoCombustivel, fabricante,numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);

        this.QuantidadePoltronas = QuantidadePoltronas;
    }
    public String mostrarDados(){
        return "Tipo Veiculo: " + this.tipoVeiculo +
                "\nQuantidade de Poltronas" + this.QuantidadePoltronas +
                "\nFabricante: " + this.fabricante +
                "\nPlaca: " + this.placa +
                "\nCombustivel: " + this.tipoCombustivel +
                "\nAno do modelo: " + this.anoModelo +
                "\nAno da Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nCor: " + this.cor +
                "\nNúmero de Chassi: " + this.numeroChassis;

    }
    public int getQuantidadePoltronas () {
        return QuantidadePoltronas;
    }
}

