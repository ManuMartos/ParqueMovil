package com.company.model;

/**
 * Created by Manu on 17/02/2017.
 */
public class Autobus extends Automovil {

     private String linea;

     //Constructores


    public Autobus(String linea) {
        this.linea = linea;
    }

    public Autobus(String marca, String modelo, String matricula, String linea) {
        super(marca, modelo, matricula);
        this.linea = linea;
    }


    //Accesores


    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    //@Override

    @Override
    public String toString() {
        return super.toString() + "Autobus{" +
                "linea='" + linea + '\'' +
                '}';
    }


    //Métodos

    public void parar(){

    }

    public void vender(){

    }
}
