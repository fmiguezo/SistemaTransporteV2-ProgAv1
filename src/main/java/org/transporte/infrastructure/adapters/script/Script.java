package org.transporte.infrastructure.adapters.script;

import org.transporte.application.dto.ViajeDTO;
import org.transporte.application.services.TransporteServiceImpl;
import org.transporte.domain.exceptions.TransporteInvalidoException;

import java.util.List;

public class Script  {
    public static void main(String[] args) throws TransporteInvalidoException {
        TransporteServiceImpl servicio = new TransporteServiceImpl();

        List<String[]> viajes = List.of(
                new String[]{"auto", "Buenos Aires", "La Plata"},
                new String[]{"dron", "CABA", "Rosario"},
                new String[]{"auto", "Córdoba", "Mendoza"}
        );

        for (String[] viaje : viajes) {
            String tipo = viaje[0];
            String origen = viaje[1];
            String destino = viaje[2];

            ViajeDTO viajeDTO = servicio.realizarViaje(tipo, origen, destino);
            viajeDTO.imprimir();
        }
    }
}