/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import static java.lang.Math.acos;
import static java.lang.Math.asin;
import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

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
                double seno(double numeroOne)
                {
                    
                    x = sin(numeroOne);
                    return x;
                    
                }
 
                double coseno(double numeroOne)
                {
                    
                    x = cos(numeroOne);
                    return x;
                    
                }
                double tangente(double numeroOne)
                {
                    
                    x = sin(numeroOne)/cos(numeroOne);
                    return x;
                    
                }double secante(double numeroOne)
                {
                    
                   x = 1/cos(numeroOne);
                    return x;
                    
                }double cosecante(double numeroOne)
                {
                    
                    x = 1/sin(numeroOne);
                    return x;
                    
                }double cotangente(double numeroOne)
                {
                    
                    x = cos(numeroOne)/sin(numeroOne);
                    return x;
                    
                }
                double arcoseno(double numeroOne)
                {
                    
                    x = asin(numeroOne);
                    return x;
                    
                }
                double arcocoseno(double numeroOne)
                {
                    
                    x = acos(numeroOne);
                    return x;
                    
                }
                 double arcotangente(double numeroOne)
                {
                    
                    x = atan(numeroOne);
                    return x;
                    
                }
}
