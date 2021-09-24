/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author edwin
 */
@Stateless
public class calcBean implements calcBeanLocal {

    @Override
    public Double sumar(double x, double y) {
        return x+y;
    }

    @Override
    public Double restar(double x, double y) {
        return x-y;
    }

    @Override
    public Double multiplicar(double x, double y) {
        return x*y;
    }

    @Override
    public Double dividir(double x, double y) {
        try{
            return x/y;
        }catch(Exception e){
            
        }
        return 0.0;
    }

    @Override
    public Double modulo(double x, double y) {
        try{
            return x%y;
        }catch(Exception e){
            
        }
        return 0.0;
    }

    @Override
    public Double potencia(double x, double y) {
        return Math.pow(x, y);
    }
   
}
