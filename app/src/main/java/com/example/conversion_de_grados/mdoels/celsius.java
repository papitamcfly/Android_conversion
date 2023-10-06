package com.example.conversion_de_grados.mdoels;

public class celsius extends grado{
    private Integer color;
    public celsius(Double valor, String unidad) {
        super(valor, unidad);
    }
    public celsius parse(farenheit f){
        return  new celsius((f.getValor()-32) * 1.8,"C");
    }
    public celsius parse(kelvin k){
        return  new celsius(k.getValor() -273.15,"C");
    }
}
