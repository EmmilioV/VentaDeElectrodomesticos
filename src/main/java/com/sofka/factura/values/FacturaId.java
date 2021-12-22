package com.sofka.factura.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.venta.values.VentaId;

public class FacturaId extends Identity {
    public FacturaId(){}

    private FacturaId (String Id){
        super(Id);
    }

    public static FacturaId of(String Id){
        return new FacturaId(Id);
    }
}
