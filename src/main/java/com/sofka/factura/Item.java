package com.sofka.factura;

import co.com.sofka.domain.generic.Entity;
import com.sofka.almacen.values.ElectrodomesticoId;
import com.sofka.factura.values.Cantidad;
import com.sofka.factura.values.ItemId;

public class Item extends Entity<ItemId> {
    private final ElectrodomesticoId electrodomesticoId;
    private final Cantidad cantidad;

    public Item(ItemId entityId, ElectrodomesticoId electrodomesticoId, Cantidad cantidad) {
        super(entityId);
        this.electrodomesticoId = electrodomesticoId;
        this.cantidad = cantidad;
    }

    public ElectrodomesticoId electrodomesticoId() {
        return electrodomesticoId;
    }

    public Cantidad cantidad() {
        return cantidad;
    }
}
