package com.sofka.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.almacen.values.AlmacenId;
import com.sofka.factura.values.FacturaId;
import com.sofka.venta.Cliente;
import com.sofka.venta.values.Fecha;

public class VentaCreada extends DomainEvent {
    private final AlmacenId almacenId;
    private final Fecha fecha;
    private final Cliente cliente;

    public VentaCreada(AlmacenId almacenId, Fecha fecha, Cliente cliente) {
        super("sofka.venta.ventaCreada");
        this.almacenId = almacenId;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public AlmacenId getAlmacenId() {
        return almacenId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
