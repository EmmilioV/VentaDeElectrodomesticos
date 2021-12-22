package com.sofka.venta.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    public ClienteId(){}

    private ClienteId (String Id){
        super(Id);
    }

    public static ClienteId of(String Id){
        return new ClienteId(Id);
    }
}
