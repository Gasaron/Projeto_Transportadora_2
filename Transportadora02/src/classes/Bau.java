package classes;

public class Bau extends Caminhao{
    private String tipoBau;

    public Bau(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
               String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao, String tipoBau) {
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, tipoCaminhao, tipoBau);
        this.tipoBau = this.tipoBau;
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
                "\nTipo de Bau: " + this.tipoBau +
                "\nNúmero de Chassi: " + this.numeroChassis;

    }
    public String getTipoBau () {
        return tipoBau;
    }
}
