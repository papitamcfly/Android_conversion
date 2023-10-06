package com.example.conversion_de_grados.mdoels;

public class grado {
private Double valor;
private String unidad;

    public grado(Double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public grado(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
