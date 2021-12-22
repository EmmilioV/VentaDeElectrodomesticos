package com.sofka.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class AsesorId extends Identity {
    public AsesorId(){}

    private AsesorId (String Id){
        super(Id);
    }

    public static AsesorId of(String Id){
        return new AsesorId(Id);
    }
}
