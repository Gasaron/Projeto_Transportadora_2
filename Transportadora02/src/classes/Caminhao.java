package classes;

public class Caminhao extends Veiculos {
    protected String tipoCaminhao;

//    construtor

        public Caminhao(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor,
                        String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo, String tipoCaminhao, String tipoBau) {
            super(placa, tipoCombustivel, fabricante,numeroChassis, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo);

            this.tipoCaminhao = this.tipoCaminhao;
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
                    "\nNúmero de Chassi: " + this.numeroChassis;

        }
        public String getipoCaminhao () {
            return tipoCaminhao;
        }
    }




