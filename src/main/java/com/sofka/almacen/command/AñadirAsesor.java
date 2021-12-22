package com.sofka.almacen.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.Generic.Edad;
import com.sofka.Generic.Nombre;
import com.sofka.Generic.NumeroDeCedula;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.almacen.values.AsesorId;

public class AñadirAsesor extends Command {
    private final AlmacenId almacenId;
    private final AsesorId entityId;
    private final NumeroDeCedula numeroDeCedula;
    private final Nombre nombre;
    private final Edad edad;

    public AñadirAsesor(AlmacenId almacenId, AsesorId entityId, NumeroDeCedula numeroDeCedula, Nombre nombre, Edad edad) {
        this.almacenId = almacenId;
        this.entityId = entityId;
        this.numeroDeCedula = numeroDeCedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public AsesorId getEntityId() {
        return entityId;
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
}

