package com.sofka.venta.values;

import co.com.sofka.domain.generic.Identity;

public class EntregaId extends Identity {
    public EntregaId(){}

    private EntregaId (String Id){
        super(Id);
    }

    public static EntregaId of(String Id){
        return new EntregaId(Id);
    }
}
