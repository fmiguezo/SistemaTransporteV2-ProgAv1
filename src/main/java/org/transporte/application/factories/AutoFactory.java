package org.transporte.application.factories;

import org.transporte.domain.model.Auto;
import org.transporte.domain.model.Transporte;

public class AutoFactory implements TransporteFactory {
    @Override
    public Transporte crear() {
        return new Auto();
    }
}