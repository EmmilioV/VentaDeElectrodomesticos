package com.sofka.venta.values;

import co.com.sofka.domain.generic.Identity;

public class VentaId extends Identity {
    public VentaId(){}

    private VentaId (String Id){
        super(Id);
    }

    public static VentaId of(String Id){
        return new VentaId(Id);
    }
}
