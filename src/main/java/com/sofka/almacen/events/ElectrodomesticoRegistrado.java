package com.sofka.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.Generic.Nombre;
import com.sofka.almacen.values.ElectrodomesticoId;
import com.sofka.almacen.values.Precio;

public class ElectrodomesticoRegistrado extends DomainEvent {
    private final ElectrodomesticoId entityId;
    private final Nombre nombre;
    private final Precio precio;

    public ElectrodomesticoRegistrado(ElectrodomesticoId entityId, Nombre nombre, Precio precio) {
        super("sofka.almacen.electrodomesticoRegistrado");

        this.entityId = entityId;
        this.nombre = nombre;
        this.precio = precio;
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
