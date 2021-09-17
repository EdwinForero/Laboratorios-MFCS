/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author edwin
 */
public class NameHandler {
     private String name;
    private String edad;

    public NameHandler(String name, String fechaNacimiento) throws ParseException {
        this.name = name;
        try {
            Date fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
            Date actual = new Date();
            long a = actual.getTime() - fechaNac.getTime();
            a = a / 365 / 24 / 60 / 60 / 1000;//Milisegundos a años
            edad = a + "";
        } catch (Exception e) {

        }
    }

    public NameHandler() {
        this.name = "";
        //this.edad = 0 + "";
    }

    public String getName() {
        Date actual = new Date();
        int hora = actual.getHours();
        String saludo;

        if (0 <= hora && hora < 12) {
            saludo = "Buenos días ";
        } else if (12 <= hora && hora < 19) {
            saludo = "Buenas tardes ";
        } else {
            saludo = "Buenas noches ";
        }

        return saludo + "Mr. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return "Edad actual: " + edad + " años";
    }

    public void setEdad(String edad) {
        try {
            Date fechaNac = new SimpleDateFormat("dd/MM/yyyy").parse(edad);
            Date actual = new Date();
            long a = actual.getTime() - fechaNac.getTime();
            a = a / 365 / 24 / 60 / 60 / 1000;
            this.edad = a + "";
        } catch (Exception e) {

        }
    }

}
