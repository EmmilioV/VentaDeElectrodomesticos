package com.sofka.almacen.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.Generic.Nombre;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.almacen.values.ElectrodomesticoId;
import com.sofka.almacen.values.Precio;

public class RegistrarElectrodomestico extends Command {
    private final AlmacenId almacenId;
    private final ElectrodomesticoId entityId;
    private final Nombre nombre;
    private final Precio precio;

    public RegistrarElectrodomestico(AlmacenId almacenId, ElectrodomesticoId entityId, Nombre nombre, Precio precio) {
        this.almacenId = almacenId;
        this.entityId = entityId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public ElectrodomesticoId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }
}
