package com.company.model;

/**
 * Created by Manu on 17/02/2017.
 */
public class Uber extends Taxi {

    private String color;

    //Constructores

    public Uber(){
        this("","","","","","");
    }

    public Uber(String marca,
                String modelo,
                String matricula,
                String horario,
                String licencia,
                String color) {

        //este super llama a taxi solamente
        //no al constructor de automovil solo puede ir de
        //un constructor en uno

        super(marca, modelo, matricula, horario, licencia);
        this.color = color;
    }

    //Accesores
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //@Override

    @Override
    public String toString() {
        return super.toString() + "Uber{" +
                "color='" + color + '\'' +
                '}';
    }
}
