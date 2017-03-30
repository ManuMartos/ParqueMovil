package com.company.model;

/**
 * Created by Manu on 16/02/2017.
 */
public class Automovil {

    protected String marca;
    protected String modelo;
    protected String matricula;

    //Constructores

    public Automovil() {

    }

    public Automovil(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    //Accesores

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //@Override

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }


    //Métodos

    public void arrancar(){

    }

    public void frenar(){

    }

    public void repostar(){

    }
}
