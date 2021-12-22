package com.sofka.venta;

import co.com.sofka.domain.generic.Entity;
import com.sofka.Generic.Ubicacion;
import com.sofka.venta.values.EntregaId;
import com.sofka.venta.values.FechaEntrega;
import com.sofka.venta.values.IsEntregado;

public class Entrega extends Entity<EntregaId> {
    private final FechaEntrega fechaEntrega;
    private final Ubicacion ubicacion;
    private final IsEntregado isEntregado;

    public Entrega(EntregaId entityId, FechaEntrega fechaEntrega, Ubicacion ubicacion, IsEntregado isEntregado) {
        super(entityId);

        this.fechaEntrega = fechaEntrega;
        this.ubicacion = ubicacion;
        this.isEntregado = isEntregado;
    }

    public FechaEntrega fechaEntrega() {
        return fechaEntrega;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public IsEntregado isEntregado() {
        return isEntregado;
    }
}
