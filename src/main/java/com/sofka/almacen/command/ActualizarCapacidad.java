package com.sofka.almacen.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.almacen.values.Capacidad;

public class ActualizarCapacidad extends Command {
    private final AlmacenId almacenId;
    private final Capacidad capacidad;

    public ActualizarCapacidad(AlmacenId almacenId, Capacidad capacidad) {
        this.almacenId = almacenId;
        this.capacidad = capacidad;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
