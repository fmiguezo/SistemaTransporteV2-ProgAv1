package org.transporte.infrastructure.adapters.cli;
import org.transporte.application.dto.ViajeDTO;
import org.transporte.application.services.TransporteServiceImpl;
import org.transporte.domain.exceptions.TransporteInvalidoException;

import java.util.Scanner;

public class MainCLI  {
    public static void main(String[] args) throws TransporteInvalidoException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de transporte (auto/dron): ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese origen: ");
        String origen = scanner.nextLine();

        System.out.print("Ingrese destino: ");
        String destino = scanner.nextLine();

        // usar transporte Service
        TransporteServiceImpl servicio = new TransporteServiceImpl();
        ViajeDTO viaje = servicio.realizarViaje(tipo, origen, destino);
        viaje.imprimir();

        scanner.close();
    }
}