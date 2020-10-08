/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Aluguel {
    private Integer idaluguel;
    private String veiculo;
    private String dataaluguel;
    private String dataentrega;
    private String cliente;
    private String entregue;
    private String observacao;
    private String valorpago;

    public Aluguel(Integer idaluguel, String veiculo, String dataaluguel, String dataentrega, String cliente, String entregue, String observacao, String valorpago) {
        this.idaluguel = idaluguel;
        this.veiculo = veiculo;
        this.dataaluguel = dataaluguel;
        this.dataentrega = dataentrega;
        this.cliente = cliente;
        this.entregue = entregue;
        this.observacao = observacao;
        this.valorpago = valorpago;
    }

    public Integer getIdaluguel() {
        return idaluguel;
    }

    public void setIdaluguel(Integer idaluguel) {
        this.idaluguel = idaluguel;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataaluguel() {
        return dataaluguel;
    }

    public void setDataaluguel(String dataaluguel) {
        this.dataaluguel = dataaluguel;
    }

    public String getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(String dataentrega) {
        this.dataentrega = dataentrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getValorpago() {
        return valorpago;
    }

    public void setValorpago(String valorpago) {
        this.valorpago = valorpago;
    }
    
}
