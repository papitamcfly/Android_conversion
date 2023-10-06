package com.example.conversion_de_grados.mdoels;

public class farenheit extends grado{
    public farenheit(Double valor, String unidad) {
        super(valor, unidad);
    }
    public farenheit parse(celsius c){
        return  new farenheit(c.getValor()*1.8+32,"F");
    }
    public farenheit parse(kelvin k){
        return  new farenheit((k.getValor() - 273.15) * 1.8+32,"F");
    }
}
