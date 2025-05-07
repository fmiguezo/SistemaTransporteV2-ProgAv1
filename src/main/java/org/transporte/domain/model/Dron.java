package org.transporte.domain.model;

public class Dron implements Transporte {
    @Override
    public String transportar(String origen, String destino) {
        return "[Dron] Volando de " + origen + " a " + destino + ".";
    }

    @Override
    public String getTipo() {
        return "Dron";
    }
}
