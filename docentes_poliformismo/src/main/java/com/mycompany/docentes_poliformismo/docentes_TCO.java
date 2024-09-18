/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes_poliformismo;

/**
 *
 * @author roxo2
 */
public class docentes_TCO extends docentes{

    private int sueldo;
    private int trabajo;
    private int extra;
    private int hora;
    private int total;

    public docentes_TCO(String nombre, String Facu, String Cadi, int num, int sueldo, int trabajo) {
        super(nombre, Facu, Cadi, num);
        this.sueldo = sueldo;
        this.trabajo = trabajo;
    }
    
    @Override
    public void calcularDatos() {
        
            hora = (sueldo /30) / 8;
        extra = (hora * 2) * trabajo ;
        total =  (sueldo + extra);
         
    }
    @Override
    public int gettotal (){

        return total;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+ "\n sueldo: " + total;
    }


    


    

}

