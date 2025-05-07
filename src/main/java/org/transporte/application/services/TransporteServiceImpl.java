package org.transporte.application.services;

import org.transporte.application.dto.ViajeDTO;
import org.transporte.application.factories.TransporteFactoryImpl;
import org.transporte.domain.ports.SistemaDeTransporte;
import org.transporte.domain.model.Transporte;
import org.transporte.domain.exceptions.TransporteInvalidoException;

public class TransporteServiceImpl implements SistemaDeTransporte {

    private final TransporteFactoryImpl factory = new TransporteFactoryImpl();

    @Override
    public ViajeDTO realizarViaje(String tipoTransporte, String origen, String destino) throws TransporteInvalidoException {
        Transporte transporte = factory.crear(tipoTransporte);
        ViajeDTO viaje = new ViajeDTO(transporte, origen, destino);
        return viaje;
    }
}