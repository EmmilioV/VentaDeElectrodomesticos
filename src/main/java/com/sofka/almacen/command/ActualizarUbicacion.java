package com.sofka.almacen.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.Generic.Ubicacion;
import com.sofka.almacen.values.AlmacenId;

public class ActualizarUbicacion extends Command {
    private final AlmacenId almacenId;
    private final Ubicacion ubicacion;

    public ActualizarUbicacion(AlmacenId almacenId, Ubicacion ubicacion) {
        this.almacenId = almacenId;
        this.ubicacion = ubicacion;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
