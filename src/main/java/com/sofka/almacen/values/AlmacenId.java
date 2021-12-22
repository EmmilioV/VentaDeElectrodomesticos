package com.sofka.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class AlmacenId extends Identity {

    public AlmacenId(){}

    private AlmacenId (String Id){
        super(Id);
    }

    public static AlmacenId of(String Id){
        return new AlmacenId(Id);
    }
}
