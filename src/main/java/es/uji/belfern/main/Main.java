package es.uji.belfern.main;

import es.uji.belfern.aeropuerto.Viajero;
import es.uji.belfern.aeropuerto.Vuelo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Main().ejecuta();
    }

    private void ejecuta() throws InterruptedException {
        Vuelo vuelo = new Vuelo("IB123 destino París");
        Viajero oscar = new Viajero("Oscar", vuelo);
        vuelo.suscribirObservador(oscar);
        Viajero pepe = new Viajero("Pepe", vuelo);
        vuelo.suscribirObservador(pepe);
        Thread.sleep(2000);
        vuelo.setUltimoSuceso("Llegada del vuelo.");
        vuelo.eliminarObservador(pepe);
        Thread.sleep(2000);
        vuelo.setUltimoSuceso("Salida de viajeros");
    }
}
