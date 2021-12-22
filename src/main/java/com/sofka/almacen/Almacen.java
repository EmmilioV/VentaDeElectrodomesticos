package com.sofka.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.Generic.Edad;
import com.sofka.Generic.Nombre;
import com.sofka.Generic.NumeroDeCedula;
import com.sofka.Generic.Ubicacion;
import com.sofka.almacen.events.*;
import com.sofka.almacen.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Almacen extends AggregateEvent<AlmacenId> {
    protected AlmacenId almacenId;
    protected Ubicacion ubicacion;
    protected Capacidad capacidad;
    protected Set<Electrodomestico> electrodomesticos;
    protected Set<Asesor> asesores;

    public Almacen(AlmacenId entityId, Ubicacion ubicacion, Capacidad capacidad) {
        super(entityId);
        appendChange(new AlmacenCreado(ubicacion, capacidad)).apply();

    }

    private Almacen(AlmacenId entityId){
        super(entityId);
        subscribe(new AlmacenChange(this));
    }

    private Almacen from(AlmacenId almacenId, List<DomainEvent> events){
        var almacen = new Almacen(almacenId);
        events.forEach(almacen::applyEvent);
        return almacen;
    }

    public void registrarElectrodomestico(ElectrodomesticoId entityId, Nombre nombre, Precio precio){
        appendChange(new ElectrodomesticoRegistrado(entityId, nombre, precio)).apply();
    }

    public void añadirAsesor(AsesorId entityId, NumeroDeCedula numeroDeCedula, Nombre nombre, Edad edad){
        appendChange(new AsesorAñadido(entityId, numeroDeCedula, nombre, edad)).apply();
    }

    public void actualizarUbicacion(Ubicacion ubicacion){
        appendChange(new UbicacionActualizada(ubicacion)).apply();
    }

    public void actualizarCapacidad(Capacidad capacidad){
        appendChange(new CapacidadActualizada(capacidad)).apply();
    }

    public void removerAsesorDeAlmacen(AsesorId asesorId){
        asesores.remove(
                asesores.stream()
                        .filter(asesor -> asesor.identity().equals(asesorId))
                        .findFirst()
        );
    }
}
