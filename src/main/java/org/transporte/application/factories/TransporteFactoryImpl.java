package org.transporte.application.factories;

import org.transporte.domain.model.Transporte;
import org.transporte.domain.exceptions.TransporteInvalidoException;
import java.util.HashMap;
import java.util.Map;

public class TransporteFactoryImpl {

    private final Map<String, TransporteFactory> factories = new HashMap<>();

    public TransporteFactoryImpl() {
        factories.put("auto", new AutoFactory());
        factories.put("dron", new DronFactory());
    }

    public Transporte crear(String tipo) throws TransporteInvalidoException {
        if (tipo == null || tipo.isEmpty()) {
            throw new TransporteInvalidoException("Tipo de transporte no puede ser nulo o vacío");
        }
        if (!factories.containsKey(tipo.toLowerCase())) {
            throw new TransporteInvalidoException("Tipo de transporte no soportado: " + tipo);
        }
        TransporteFactory factory = factories.get(tipo.toLowerCase());
        return factory.crear();
    }
}