package org.transporte.application.factories;

import org.transporte.domain.model.Transporte;
import org.transporte.domain.exceptions.TransporteInvalidoException;

public interface TransporteFactory {
    Transporte crear() throws TransporteInvalidoException;
}