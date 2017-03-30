package com.company.model;

import com.company.model.Automovil;

/**
 * Created by Manu on 16/02/2017.
 */
public class Taxi extends Automovil {

    private String horario;
    private String licencia;

    //Constructores


    public Taxi(String horario, String licencia) {
        this.horario = horario;
        this.licencia = licencia;
    }

    public Taxi(String marca, String modelo, String matricula, String horario, String licencia) {

        //Llama al constructor de la clase automovil
        super(marca, modelo, matricula);

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

    //@Override

    @Override
    public String toString() {

        //super.toString() en este return es para que coja el toString de
        //automovil en este caso
        return super.toString() + " Taxi{" +
                "horario='" + horario + '\'' +
                ", licencia='" + licencia + '\'' +
                '}';
    }


    //Métodos

    public void iniciarCarrera(){

    }

    public void finalizarCarrera(){

    }

    public void cobrarCarrera(){

    }
}
