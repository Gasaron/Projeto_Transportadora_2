package classes;

public class Carro extends Veiculos {

    private int quantidadeLugares;
//    construtor

    public Carro(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                  String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, int quantidadeLugares) {
        super( placa, tipoCombustivel, fabricante,numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);

        this.quantidadeLugares = quantidadeLugares;
    }
    public String mostrarDados(){
        return "Tipo Veiculo: " + this.tipoVeiculo +
                "\nFabricante: " + this.fabricante +
                "\nPlaca: " + this.placa +
                "\nCombustivel: " + this.tipoCombustivel +
                "\nAno do modelo: " + this.anoModelo +
                "\nAno da Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nCor: " + this.cor +
                "\nQuantidade de Lugares" + this.quantidadeLugares +
                "\nNúmero de Chassi: " + this.numeroChassis +
                "\n***************************\n";

    }
    public int getQuantidadeLugares () {
        return quantidadeLugares;
    }
}
