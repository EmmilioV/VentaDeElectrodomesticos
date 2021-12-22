package com.sofka.factura.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.venta.values.VentaId;

public class ItemId extends Identity {
    public ItemId(){}

    private ItemId (String Id){
        super(Id);
    }

    public static ItemId of(String Id){
        return new ItemId(Id);
    }
}
