package com.example.conversion_de_grados.mdoels;

public class kelvin extends grado{
    public kelvin(Double valor, String unidad) {
        super(valor, unidad);
    }
    public kelvin parse(farenheit f){
        return  new kelvin((f.getValor()-32)*1.8+273.15,"K");
    }
    public kelvin parse(celsius c){
        return  new kelvin(c.getValor() + 273.15,"K");
    }
}
