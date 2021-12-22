package com.sofka.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.factura.events.FacturaCreada;
import com.sofka.factura.values.FacturaId;

public class Factura extends AggregateEvent<FacturaId> {

    public Factura(FacturaId entityId) {
        super(entityId);
        appendChange(new FacturaCreada()).apply();
    }
}
