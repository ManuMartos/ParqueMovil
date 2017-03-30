package com.company.controller;

import com.company.model.Automovil;
import com.company.model.Taxi;
import com.company.model.Uber;

public class Main {

    public static void main(String[] args) {

        Uber miUber = new Uber("Renault",
                                "Megane",
                                "1234-ABC",
                                "mañana",
                                "s9d8f",
                                "rojo");

        System.out.println(miUber);

    }
}
