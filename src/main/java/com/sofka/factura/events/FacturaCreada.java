package com.sofka.factura.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCreada extends DomainEvent {
    public FacturaCreada() {
        super("sofka.factura.facturaCreada");
    }
}
