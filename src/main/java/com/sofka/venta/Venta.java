package com.sofka.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.factura.values.FacturaId;
import com.sofka.venta.events.VentaCreada;
import com.sofka.venta.values.Fecha;
import com.sofka.venta.values.VentaId;

public class Venta extends AggregateEvent<VentaId> {
    protected AlmacenId almacenId;
    protected Fecha fecha;
    protected Cliente cliente;

    public Venta(VentaId entityId, AlmacenId almacenId, Fecha fecha, Cliente cliente) {
        super(entityId);
        appendChange(new VentaCreada(almacenId, fecha, cliente)).apply();
    }
}
