package br.fvc.pi3.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numero;
    private String placa;
    private String fabricante;
    private String modelo;
    private String anomodelo;
    private String qtdportas;

    public Veiculo() {
    }
    
    public Veiculo(Long numero, String placa, String fabricante, String modelo, String anomodelo, String qtdportas) {
        this.numero = numero;
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anomodelo = anomodelo;
        this.qtdportas = qtdportas;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }
    
}
