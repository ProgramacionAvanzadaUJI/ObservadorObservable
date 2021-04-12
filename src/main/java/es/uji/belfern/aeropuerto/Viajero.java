package es.uji.belfern.aeropuerto;

import es.uji.belfern.observador.Observador;

public class Viajero implements Observador {
    private String nombre;
    private Vuelo vuelo;

    public Viajero(String nombre, Vuelo vuelo) {
        super();
        this.nombre = nombre;
        this.vuelo = vuelo;
    }

    @Override
    public void notificar() {
        System.out.println(nombre + "<-- Notificar: " + vuelo.getUltimoSuceso());
    }
}
