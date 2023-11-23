package classes;

public class Carreta extends Caminhao {
    private int quantidadeContainers;

            public Carreta (String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                         String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao, String tipoBau) {
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, tipoCaminhao, tipoBau);
        this.quantidadeContainers = this.quantidadeContainers;
    }
    public String mostrarDados(){
        return "Tipo Veiculo: " + this.tipoVeiculo +
                "\nTipo de Caminhão: " + this.tipoCaminhao +
                "\nFabricante: " + this.fabricante +
                "\nPlaca: " + this.placa +
                "\nCombustivel: " + this.tipoCombustivel +
                "\nAno do modelo: " + this.anoModelo +
                "\nAno da Fabricação: " + this.anoFabricacao +
                "\nModelo: " + this.modelo +
                "\nCor: " + this.cor +
                "\nQuantidade de Container: " + this.quantidadeContainers +
                "\nNúmero de Chassi: " + this.numeroChassis;

    }
    public int getTipoBau () {
        return quantidadeContainers;
    }
}

