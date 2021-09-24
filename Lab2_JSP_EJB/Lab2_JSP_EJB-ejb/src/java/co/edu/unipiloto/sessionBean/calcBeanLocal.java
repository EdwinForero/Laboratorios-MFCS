/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Local;

/**
 *
 * @author edwin
 */
@Local
public interface calcBeanLocal {

    Double sumar(double x, double y);

    Double restar(double x, double y);

    Double multiplicar(double x, double y);

    Double dividir(double x, double y);

    Double modulo(double x, double y);

    Double potencia(double x, double y);
    
}
