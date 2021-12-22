package com.sofka.almacen;

import co.com.sofka.domain.generic.Entity;
import com.sofka.Generic.Edad;
import com.sofka.Generic.Nombre;
import com.sofka.Generic.NumeroDeCedula;
import com.sofka.almacen.values.AsesorId;

public class Asesor extends Entity<AsesorId> {
    private final NumeroDeCedula numeroDeCedula;
    private final Nombre nombre;
    private final Edad edad;

    public Asesor(AsesorId entityId, NumeroDeCedula numeroDeCedula, Nombre nombre, Edad edad) {
        super(entityId);
        this.numeroDeCedula = numeroDeCedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public NumeroDeCedula numeroDeCedula() {
        return numeroDeCedula;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }
}
