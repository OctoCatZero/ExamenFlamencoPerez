/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flamenco.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lauraflamenco
 */
public class TestEvaluacion {
 
    public static void main(String[] args) {
        // TODO code application logic here
 ApplicationContext cts=new 
                
    AnnotationConfigApplicationContext(ServletExamen.class);
     Evaluacion e=cts.getBean(Evaluacion.class);
     e.setNombre("Ana");
     e.setCalificacion(7);
     System.out.println(e.getCalificacion());
        System.out.println(e.nombre);
    
    
  }  
}
  

