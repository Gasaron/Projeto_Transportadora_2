package classes;

import java.io.Serializable;

public class Veiculos {
    protected String placa;
    protected String tipoCombustivel;
    protected String fabricante;
    protected String numeroChassis;
    protected String cor;
    protected String tipoVeiculo;
    protected String modelo;
    protected String anoFabricacao;
    protected String anoModelo;

    public Veiculos(String placa, String tipoCombustivel, String fabricante, String numeroChassis, String cor, String tipoVeiculo, String modelo, String anoFabricacao, String anoModelo) {
        super();
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
        this.fabricante = fabricante;
        this.numeroChassis = numeroChassis;
        this.cor = cor;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroChassis() {
        return numeroChassis;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }
}
