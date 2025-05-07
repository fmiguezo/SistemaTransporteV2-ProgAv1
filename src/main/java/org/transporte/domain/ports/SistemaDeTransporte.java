package org.transporte.domain.ports;

import org.transporte.application.dto.ViajeDTO;
import org.transporte.domain.exceptions.TransporteInvalidoException;

public interface SistemaDeTransporte {
    ViajeDTO realizarViaje(String tipoTransporte, String origen, String destino) throws TransporteInvalidoException;
}