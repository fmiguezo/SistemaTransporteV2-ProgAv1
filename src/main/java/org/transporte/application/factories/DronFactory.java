package org.transporte.application.factories;

import org.transporte.domain.model.Dron;
import org.transporte.domain.model.Transporte;

public class DronFactory implements TransporteFactory {
    @Override
    public Transporte crear() {
        return new Dron();
    }
}