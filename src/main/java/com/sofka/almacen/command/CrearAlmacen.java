package com.sofka.almacen.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.Generic.Ubicacion;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.almacen.values.Capacidad;

public class CrearAlmacen extends Command {
    private final AlmacenId entityId;
    private final Ubicacion ubicacion;
    private final Capacidad capacidad;

    public CrearAlmacen(AlmacenId entityId, Ubicacion ubicacion, Capacidad capacidad) {
        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public AlmacenId getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
