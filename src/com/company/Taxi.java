package com.company;

/**
 * Created by Manu on 16/02/2017.
 */
public class Taxi extends Automovil {
    private String horario;
    private String licencia;

    //Constructores


    public Taxi() {
        this.marca = "Volvo";
    }

    public Taxi(String horario, String licencia) {
        this.horario = horario;
        this.licencia = licencia;
    }


    //Accesores

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }


    //Métodos

    public void iniciarCarrera(){

    }

    public void finalizarCarrera(){

    }

    public void cobrarCarrera(){

    }
}
