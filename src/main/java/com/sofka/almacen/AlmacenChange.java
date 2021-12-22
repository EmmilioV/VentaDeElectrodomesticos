package com.sofka.almacen;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.almacen.events.*;

import java.util.HashSet;

public class AlmacenChange extends EventChange {
    public AlmacenChange(Almacen almacen) {
        apply((AlmacenCreado event) -> {
            almacen.capacidad = event.getCapacidad();
            almacen.ubicacion = event.getUbicacion();
            almacen.electrodomesticos = new HashSet<>();
            almacen.asesores = new HashSet<>();
        });

        apply((AsesorAñadido event)->{
            Asesor asesor = new Asesor(event.getEntityId(), event.getNumeroDeCedula(), event.getNombre(), event.getEdad());
            almacen.asesores.add(asesor);
        });

        apply((ElectrodomesticoRegistrado event)->{
            if(almacen.capacidad.equals(almacen.electrodomesticos.size())){
                throw new IllegalArgumentException("El almacen ha superado la capacidad");
            }
            Electrodomestico electrodomestico = new Electrodomestico(event.getEntityId(), event.getNombre(), event.getPrecio());
            almacen.electrodomesticos.add(electrodomestico);
        });

        apply((UbicacionActualizada event)->{
            almacen.ubicacion = event.getUbicacion();
        });

        apply((CapacidadActualizada event) -> {
            if(event.getCapacidad().value() < 10){
                throw new IllegalArgumentException("La capacidad debe de ser mayor o igual a 10");
            }
            almacen.capacidad = event.getCapacidad();
        });
    }
}
