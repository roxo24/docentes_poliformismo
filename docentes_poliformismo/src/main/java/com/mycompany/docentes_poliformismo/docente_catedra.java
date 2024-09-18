/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes_poliformismo;

/**
 *
 * @author roxo2
 */
public class docente_catedra extends docentes {

    private int horas;
    private int valor;
    

    public docente_catedra(String nombre, String Facu, String Cadi, int num, int horas, int valor) {
        super(nombre, Facu, Cadi, num);
        this.horas = horas;
        this.valor = valor;
    }
    private int total;
    
    @Override
    public void calcularDatos() {
            total = (valor * horas);
               
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
