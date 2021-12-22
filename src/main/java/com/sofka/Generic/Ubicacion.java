package com.sofka.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<Ubicacion.Properties> {

    private final String nombreCiudad;
    private final String direccion;

    public Ubicacion(String nombreCiudad, String direccion) {
        this.nombreCiudad = Objects.requireNonNull(nombreCiudad, "el nombre de la ciudad no debe ser nulo");
        this.direccion = Objects.requireNonNull(direccion, "la direccion no debe ser nulo");
    }

    public Properties value(){
        return new Properties() {
            @Override
            public String nombreCiudad() {
                return nombreCiudad;
            }

            @Override
            public String direccion() {
                return direccion;
            }
        };
    }

    public interface Properties{
        String nombreCiudad();
        String direccion();
    }
}
