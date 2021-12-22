package com.sofka.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.Generic.Ubicacion;

import java.util.Objects;

public class UbicacionActualizada extends DomainEvent {
    private final Ubicacion ubicacion;

    public UbicacionActualizada(Ubicacion ubicacion) {
        super("sofka.almacen.ubicacionActualizada");
        this.ubicacion = Objects.requireNonNull(ubicacion, "La ubicacion no puede ser nula");
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
