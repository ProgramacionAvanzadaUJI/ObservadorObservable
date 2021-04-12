package es.uji.belfern.aeropuerto;

import es.uji.belfern.observador.Observado;

public class Vuelo extends Observado {
    private String codigoDestino;
    private String ultimoSuceso;
    public Vuelo(String codigoDestino) {
        super();
        this.codigoDestino = codigoDestino;
        ultimoSuceso = "";
    }
    public String getUltimoSuceso() {
        return codigoDestino + ":" + ultimoSuceso;
    }
    public void setUltimoSuceso(String ultimoSuceso) {
        this.ultimoSuceso = ultimoSuceso;
        notificarObservadores();
    }
}