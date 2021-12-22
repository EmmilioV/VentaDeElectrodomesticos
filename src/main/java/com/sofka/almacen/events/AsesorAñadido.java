package com.sofka.almacen.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.Generic.Edad;
import com.sofka.Generic.Nombre;
import com.sofka.Generic.NumeroDeCedula;
import com.sofka.almacen.values.AsesorId;

public class AsesorAñadido extends DomainEvent {
    private final AsesorId entityId;
    private final NumeroDeCedula numeroDeCedula;
    private final Nombre nombre;
    private final Edad edad;

    public AsesorAñadido(AsesorId entityId, NumeroDeCedula numeroDeCedula, Nombre nombre, Edad edad) {
        super("sofka.almacen.asesorAñadido");

        this.entityId = entityId;
        this.numeroDeCedula = numeroDeCedula;
        this.nombre = nombre;
        this.edad = edad;
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
