package com.sofka.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.almacen.values.Capacidad;

import java.util.Objects;

public class CapacidadActualizada extends DomainEvent {
    private final Capacidad capacidad;

    public CapacidadActualizada(Capacidad capacidad) {
        super("sofka.almacen.capacidadActualizada");
        this.capacidad = Objects.requireNonNull(capacidad, "La capacidad no puede ser nula");
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
