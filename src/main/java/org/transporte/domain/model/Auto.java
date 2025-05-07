package org.transporte.domain.model;

public class Auto implements Transporte {
    @Override
    public String transportar(String origen, String destino) {
        return "[Auto] Transportando desde " + origen + " hacia " + destino + " por carretera.";
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}