package classes;

public class Bau extends Caminhao{
    protected String tipoBau;
    public Bau(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                    String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao,
                    String tipoBau){
        super(placa, tipoCombustivel, fabricante, numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, tipoCaminhao);
        this.tipoBau = tipoBau;
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
                "\nTipo de Baú: " + this.tipoBau +
                "\nNúmero de chassi: " + this.numeroChassis +
                "\n****************************************\n";
    }
}
