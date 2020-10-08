/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class veiculo {
    private Integer numero;
    private String placa;
    private String fabricante;
    private String modelo;
    private String anomodelo;
    private String qtdportas;

    public veiculo(Integer numero, String placa, String fabricante, String modelo, String anomodelo, String qtdportas) {
        this.numero = numero;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anomodelo = anomodelo;
        this.qtdportas = qtdportas;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(String anomodelo) {
        this.anomodelo = anomodelo;
    }

    public String getQtdportas() {
        return qtdportas;
    }

    public void setQtdportas(String qtdportas) {
        this.qtdportas = qtdportas;
    }
    
}
