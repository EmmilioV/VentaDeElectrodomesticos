package com.sofka.almacen.values;

import co.com.sofka.domain.generic.Identity;

public class ElectrodomesticoId extends Identity {

    public ElectrodomesticoId(){}

    private ElectrodomesticoId (String Id){
        super(Id);
    }

    public static ElectrodomesticoId of(String Id){
        return new ElectrodomesticoId(Id);
    }
}
