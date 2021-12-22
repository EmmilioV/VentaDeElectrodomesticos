package com.sofka.almacen;

import co.com.sofka.domain.generic.Entity;
import com.sofka.Generic.Nombre;
import com.sofka.almacen.values.ElectrodomesticoId;
import com.sofka.almacen.values.Precio;

import java.util.Objects;

public class Electrodomestico extends Entity<ElectrodomesticoId> {
    private Nombre nombre;
    private Precio precio;

    public Electrodomestico(ElectrodomesticoId entityId, Nombre nombre, Precio precio) {
        super(entityId);
        this.nombre = nombre;
        this.precio = precio;
    }

    public void ActualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede estar nulo");
    }

    public void ActualizarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio, "El precio no puede estar nulo");
    }

    public Nombre nombre() {
        return nombre;
    }

    public Precio precio() {
        return precio;
    }
}
