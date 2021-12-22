package com.sofka.venta;

import co.com.sofka.domain.generic.Entity;
import com.sofka.Generic.Edad;
import com.sofka.Generic.Nombre;
import com.sofka.Generic.NumeroDeCedula;
import com.sofka.Generic.Ubicacion;
import com.sofka.venta.values.ClienteId;
import com.sofka.venta.values.Telefono;

public class Cliente extends Entity<ClienteId> {

    private final NumeroDeCedula numeroDeCedula;
    private final Nombre nombre;
    private final Edad edad;
    private final Ubicacion ubicacion;
    private final Telefono telefono;

    public Cliente(ClienteId entityId, NumeroDeCedula numeroDeCedula, Nombre nombre, Edad edad, Ubicacion ubicacion, Telefono telefono) {
        super(entityId);
        this.numeroDeCedula = numeroDeCedula;
        this.nombre = nombre;
        this.edad = edad;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }


    public NumeroDeCedula getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
