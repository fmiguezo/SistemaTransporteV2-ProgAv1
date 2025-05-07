package org.transporte.application.dto;

import org.transporte.domain.model.Transporte;

public class ViajeDTO {
    private Transporte vehiculo;
    private String origen;
    private String destino;

    public ViajeDTO(Transporte vehiculo, String origen, String destino) {
        this.vehiculo = vehiculo;
        this.origen = origen;
        this.destino = destino;
    }

    public Transporte getVehiculo() {
        return vehiculo;
    }

    public String getTipoTransporte() {
        return vehiculo.getTipo();
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void imprimir() {
        System.out.println(vehiculo.transportar(origen, destino));
    }
}