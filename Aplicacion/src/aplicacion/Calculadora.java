/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Estudiantes
 */
public class Calculadora{
        
    double x;
    
    double suma(double numeroOne,double numeroTwo){
        
        x = numeroOne +numeroTwo;
        
        return x;
    }
        double resta(double numeroOne,double numeroTwo){
        
        x = numeroOne - numeroTwo;
        
        return x;
    }
            double multiplicacion(double numeroOne,double numeroTwo){
        
        x = numeroOne*numeroTwo;
        
        return x;
    }
                double division(double numeroOne,double numeroTwo){
        
        x = numeroOne/numeroTwo;
        
        return x;
    }
    
}

