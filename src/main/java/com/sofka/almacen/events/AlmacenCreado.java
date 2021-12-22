package com.sofka.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.Generic.Ubicacion;
import com.sofka.almacen.values.Capacidad;

public class AlmacenCreado extends DomainEvent {
    private final Ubicacion ubicacion;
    private final Capacidad capacidad;

    public AlmacenCreado(Ubicacion ubicacion, Capacidad capacidad) {
        super("sofka.almacen.almacenCreado");
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
