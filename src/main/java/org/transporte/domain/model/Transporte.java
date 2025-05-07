package org.transporte.domain.model;

public interface Transporte {
    String transportar(String origen, String destino);
    String getTipo();
}